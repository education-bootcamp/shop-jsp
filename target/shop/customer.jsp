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
<%@include file="header.jsp" %>

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
                <button type="button"
                        onclick="saveCustomer()"
                        class="btn btn-primary btn-sm">Save Customer</button>
            </div>
        </div>
    </div>
    <hr>
    <table class="table table-hover">
        <tr>
            <td>#</td>
            <td>Name</td>
            <td>Address</td>
            <td>Salary</td>
            <td>Delete</td>
            <td>Update</td>
        </tr>
    </table>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript">
    const saveCustomer = () => {
        $.ajax({
            url: 'http://localhost:8080/customer',
            method: 'POST',
            data_type:'json',
            data: {
                id:$('#customerId').val(),
                name:$('#name').val(),
                address:$('#address').val(),
                salary:$('#salary').val(),
            },
            success: function (response) {
                console.log(response);
            }
        })
    }

</script>

</body>
</html>