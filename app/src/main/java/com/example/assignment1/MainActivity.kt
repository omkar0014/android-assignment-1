package com.example.assignment1


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference UI components
        val editTextName: EditText = findViewById(R.id.editTextName)
        val editTextEmail: EditText = findViewById(R.id.editTextEmail)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val editTextContact: EditText = findViewById(R.id.editTextContact)
        val editTextAddress: EditText = findViewById(R.id.editTextAddress)
        val registerButton: Button = findViewById(R.id.registerButton)

        // Set a click listener for the register button
        registerButton.setOnClickListener {
            // Get input values
            val name = editTextName.text.toString().trim()
            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()
            val contact = editTextContact.text.toString().trim()
            val address = editTextAddress.text.toString().trim()

            // Check for empty fields
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || contact.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Display a success message
                val message = """
                    Registration Successful!
                    Name: $name
                    Email: $email
                    Contact: $contact
                    Address: $address
                """.trimIndent()
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}