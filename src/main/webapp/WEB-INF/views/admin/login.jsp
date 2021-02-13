<%@include file="/common/taglib.jsp"%>>

<form action="j_spring_security_check" id="formLogin" method="post">
	<div class="form-group">
		<div class="form-label-group">
			<input name="j_username" class="form-control" required="required"
				autofocus="autofocus"> <label for="inputEmail">Username</label>
		</div>
	</div>
	<div class="form-group">
		<div class="form-label-group">
			<input name="j_password" type="password" id="inputPassword"
				class="form-control" placeholder="Password" required="required">
			<label for="inputPassword">Password</label>
		</div>
	</div>
	<div class="form-group">
		<div class="checkbox">
			<label> <input type="checkbox" value="remember-me">
				Remember Password
			</label>
		</div>
	</div>
	<button type="submit" class="btn btn-primary btn-block">Login</button>

</form>
<div class="text-center">
	<a class="d-block small mt-3" href="register.html">Register an
		Account</a> <a class="d-block small" href="forgot-password.html">Forgot
		Password?</a>
</div>
