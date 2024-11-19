package com.students.student;


import com.students.student.entity.Card;
import com.students.student.entity.Item;
import com.students.student.repository.CartRepository;
import com.students.student.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShoppingController {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/cards")
    public List<Card> getAllCards(){
        return cartRepository.findAll();
    }

    @GetMapping("/items")
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    @GetMapping("{id}")
    public Optional<Card> getById(@PathVariable("id") Integer id){
        return cartRepository.findById(id);
    }

    @PostMapping("/card")
    public Card addCard(@RequestBody Card card){
        return cartRepository.save(card);
    }
    @PostMapping("/item")
    public Item addItem(@RequestBody Item item){
        return itemRepository.save(item);
    }
    @PutMapping("/addtocard")
    public String addtoCart(@RequestParam int cartId, @RequestParam int itemId){
        Card card = cartRepository.findById(cartId).get();
        Item item = itemRepository.findById(itemId).get();
        item.setCard(card);
        itemRepository.save(item);
        return "Cart Updated Successfully";


    }
}
