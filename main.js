const search = document.querySelector(".navBar .search");
const bannerSlideRight = document.querySelector(".banner-display button#right");
const bannerSlideLeft = document.querySelector(".banner-display button#left");
const featuredSlideRight = document.querySelector(".item-list button#right");
const featuredSlideLeft = document.querySelector(".item-list button#left");
const listItems = [...document.querySelector(".lists").children];

function ItemCard({}) {}
let currentList = 0;
let previousList = 0;
featuredSlideRight.addEventListener("click", () => {
  previousList = currentList;
  currentList = currentList < listItems.length - 1 ? currentList + 1 : 0;
  update();
});

function update() {
  listItems.forEach((item, index) => {
    if (index === currentList) {
      item.style.display = "grid";
      item.classList.add("slide-in-left");
    } else if (index === previousList) {
      item.classList.add("slide-out-right");
      item.style.transform = "translateY(100%)";
      setTimeout(() => {
        item.style.display = "none";
      }, 800);
      item.classList.remove("slide-in-left");
    } else {
      item.style.display = "none";
      item.classList.remove("slide-out-right");
    }
  });
}
