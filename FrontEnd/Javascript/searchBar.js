const search = document.querySelector(".search");

search.addEventListener("keypress", function (e) {
  if (e.key === "Enter") {
    let text = search.value;
    fetch("216.69.162.135:3306/items/11")
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
      });
  }
});

console.log(search);
