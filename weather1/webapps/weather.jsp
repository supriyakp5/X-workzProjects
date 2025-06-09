<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<h1>Weather Application</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<form action="weather" method="post">
<div class="mb-3 row">
    <label for="location" class="col-sm-2 col-form-label">Location</label>
    <div class="col-sm-10">
        <input type="text"  class="form-control" id="location" name="location" required >
    </div>
</div>
<div class="mb-3 row">
    <label for="captured" class="col-sm-2 col-form-label">Captured By</label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="captured" name="captured" required>
    </div>
</div>

<div class="mb-3 row">
    <label for="temperature" class="col-sm-2 col-form-label">Temperature</label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="temperature" name="temperature" required>
    </div>
</div>

<div class="mb-3 row">
    <label for="recorded" class="col-sm-2 col-form-label">Recorded By</label>
    <div class="col-sm-10">
        <input type="text" class="form-control" id="recorded"  name="recorded" required>
    </div>
</div>
<div>
    <button type="submit" class="btn btn-success" >Success</button>
</div>
</form>

</body>


</html>