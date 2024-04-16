package ap.example.tugaskuliahasinkron;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// TodoAdapter.java
public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {
    private List<TodoItem> todoList;

    public TodoAdapter(List<TodoItem> todoList) {
        this.todoList = todoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_todo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TodoItem todoItem = todoList.get(position);
        holder.tvWhat.setText(todoItem.getWhat());
        holder.tvTime.setText(todoItem.getTime());
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvWhat;
        TextView tvTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvWhat = itemView.findViewById(R.id.tvWhat);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}
