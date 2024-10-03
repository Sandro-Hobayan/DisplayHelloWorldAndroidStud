package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class shoppingList extends AppCompatActivity {

    EditText input;
    Button add;
    ListView output;
    TextView instruction;

    List<String> items = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shopping_list);

        input = findViewById(R.id.et_shoppingListInput);
        add = findViewById(R.id.btn_shoppingListAdd);
        output = findViewById(R.id.lt_shoppingListOutput);
        instruction = findViewById(R.id.tv_shoppingListInstruction);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        output.setAdapter(adapter); // Set the adapter to the ListView

        add.setOnClickListener(v -> {
            addList();
        });

        output.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = items.get(position);
            // Handle the click (e.g., show a toast or perform an action)
        });

        // Handle delete button clicks
        output.setOnItemLongClickListener((parent, view, position, id) -> {
            items.remove(position);
            adapter.notifyDataSetChanged();
            return true; // Return true to consume the long click event
        });

    }

    public void addList() {
        String newItem = input.getText().toString().trim();
        if (!newItem.isEmpty()) {
            items.add(newItem);
            adapter.notifyDataSetChanged();
            input.setText("");
            instruction.setText("Hold the item to remove");
        }
    }
}
