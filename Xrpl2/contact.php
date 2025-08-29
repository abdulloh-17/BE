<?php
include 'header.php';
?>
<h2>beri kami komentar jika anda berani</h2>
<form>
  <label>Nama:</label><br>
  <input type="text" name="name"><br><br>

  <label>Pesan:</label><br>
  <textarea name="komentar"></textarea><br><br>

  <button type="submit">submit</button>
</form>
<?php
require 'footer.php';
?>