package com.example.displayhelloworldactivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;
import java.util.ArrayList;

public class toDoManager extends AppCompatActivity {

    EditText input;
    Button addTask;
    TextView instruction;
    ListView output;

    List<String> todo = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_to_do_manager);

        input = findViewById(R.id.et_toDoManagerInput);
        addTask = findViewById(R.id.btn_toDoManagerAdd);
        instruction = findViewById(R.id.tv_toDoManagerInstruction);
        output = findViewById(R.id.lt_toDoManagerOutput);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todo);
        output.setAdapter(adapter);

        addTask.setOnClickListener(v->{
            String newTodo = input.getText().toString().trim();
            if (!newTodo.isEmpty()) {
                todo.add(newTodo);
                adapter.notifyDataSetChanged();
                input.setText("");
                instruction.setText("Hold the list to remove");
            }
        });

        output.setOnItemClickListener((parent, view, position, id)->{
            String selectedTasks = todo.get(position);
        });

        output.setOnItemLongClickListener((parent, view, position, id)->{
            todo.remove(position);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}