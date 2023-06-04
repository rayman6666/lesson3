package ru.mirea.komaristyi.favoritebook;

import static ru.mirea.komaristyi.favoritebook.MainActivity.USER_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    private EditText editTextUserBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        editTextUserBook = findViewById(R.id.editTextUserBook);

        // Получение данных из MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView textViewDeveloperBook = findViewById(R.id.textViewDeveloperBook);
            String developerBook = extras.getString(MainActivity.KEY);
            textViewDeveloperBook.setText(String.format("Любимая книга разработчика: %s", developerBook));
        }
    }

    public void sendUserBook(View view) {
        // Отправка введенных пользователем данных по нажатию на кнопку
        Intent data = new Intent();
        String userBook = editTextUserBook.getText().toString();
        data.putExtra(USER_MESSAGE, "Название Вашей любимой книги: " + userBook);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}