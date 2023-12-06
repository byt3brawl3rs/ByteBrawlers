package com.ByteBrawlers.ByteBrawlers.Utility;

import com.ByteBrawlers.ByteBrawlers.Model.*;
import com.ByteBrawlers.ByteBrawlers.Repository.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@Component
public class PopulateDatabase {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private FormFactorRepository formFactorRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @PostConstruct
    private void initTypes() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("./src/main/java/com/ByteBrawlers/ByteBrawlers/Utility/TextFiles/type.txt"));
        ArrayList<Type> types = new ArrayList<>();
        try {
            while (inFile.hasNextLine()) {
                Integer id = inFile.nextInt();
                inFile.nextLine();
                String type = inFile.nextLine();
                types.add(new Type(id, type));
            }
            typeRepository.saveAllAndFlush(types);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @PostConstruct
    private void initColors() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("./src/main/java/com/ByteBrawlers/ByteBrawlers/Utility/TextFiles/color.txt"));
        ArrayList<Color> colors = new ArrayList<>();
        try {
            while (inFile.hasNextLine()) {
                Integer id = inFile.nextInt();
                inFile.nextLine();
                String color = inFile.nextLine();
                colors.add(new Color(id, color));
            }
            colorRepository.saveAllAndFlush(colors);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @PostConstruct
    private void initFormFactor() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("./src/main/java/com/ByteBrawlers/ByteBrawlers/Utility/TextFiles/formFactor.txt"));
        ArrayList<FormFactor> formFactors = new ArrayList<>();
        try {
            while (inFile.hasNextLine()) {
                Integer id = inFile.nextInt();
                inFile.nextLine();
                String formFactor = inFile.nextLine();
                formFactors.add(new FormFactor(id, formFactor));
            }
            formFactorRepository.saveAllAndFlush(formFactors);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @PostConstruct
    private void initSize() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("./src/main/java/com/ByteBrawlers/ByteBrawlers/Utility/TextFiles/size.txt"));
        ArrayList<Size> sizes = new ArrayList<>();
        try {
            while (inFile.hasNextLine()) {
                Integer id = inFile.nextInt();
                inFile.nextLine();
                String size = inFile.nextLine();
                sizes.add(new Size(id, size));
            }
            sizeRepository.saveAllAndFlush(sizes);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @PostConstruct
    private void initItems() throws FileNotFoundException {
        Scanner inFile = new Scanner(new File("./src/main/java/com/ByteBrawlers/ByteBrawlers/Utility/TextFiles/item.txt"));
        ArrayList<Item> items = new ArrayList<>();
        try {
            System.out.println("Working");
            while (inFile.hasNextLine()) {
                Integer id = inFile.nextInt();
                inFile.nextLine();
                String description = inFile.nextLine();
                Double price = inFile.nextDouble();
                inFile.nextLine();
                Double rating = inFile.nextDouble();
                inFile.nextLine();
                String title = inFile.nextLine();
                Integer colorId = inFile.nextInt();
                inFile.nextLine();
                Integer formFactorId = inFile.nextInt();
                inFile.nextLine();
                Integer sizeId = inFile.nextInt();
                inFile.nextLine();
                Integer typeId = inFile.nextInt();
                inFile.nextLine();
                items.add(new Item(id, title, description, typeId, colorId, sizeId, formFactorId, price, rating));
            }
            itemRepository.saveAllAndFlush(items);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
