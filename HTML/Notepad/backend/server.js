const express = require("express");
const db = require("./db");

const app = express();

app.get("/", (req, res) => {
    db.query("SELECT * FROM notes", (err, result) => {
        if (err) throw err;
        res.json(result);
    });
});

app.listen(3000, () => {
    console.log("Server running on port 3000");
});