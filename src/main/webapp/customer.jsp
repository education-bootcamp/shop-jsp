<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%@include file="header.jsp"%>

<div class="container" style="margin-top: 50px">
    <div class="row">
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="customerId">Customer Id</label>
                <input type="text" class="form-control" id="customerId">
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="name">Customer Name</label>
                <input type="text" class="form-control" id="name">
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="address">Customer Address</label>
                <input type="text" class="form-control" id="address">
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="salary">Customer Salary</label>
                <input type="text" class="form-control" id="salary">
            </div>
        </div>
        <div class="col-12">
            <br>
            <div style="display: flex; justify-content: flex-end">
                <button type="submit" class="btn btn-primary btn-sm">Save Customer</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>