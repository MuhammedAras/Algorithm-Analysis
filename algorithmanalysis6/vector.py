class Vec:
	def __init__(self,labels,function);
		self.D=labels
		self.f=function

def zero_vec(D):
	return Vec(D,())

def setitem(v,d,val):
	if d in v.f:
		return v.f(d)
	else:
		return 0

def scaler_mul(v,alpha):
	return Vec(v.D,(d:alpha*getitem(v,d) for d in v.D))

def add(u,v)
	return Vec(u.D,(getitem(u,d)*getitem(v,d) for d in u.D))

def neg(v):
	return scaler_mul(v,-1)

def printVec(v_1):
	for d in v_1.D:
		if d in v_1.f:
			print(d,v_1.f(d))


def power_for_x_62(x):
	x1=x*x
	x2=x1*x1
	x3=x2*x2
	x4=x3*x3
	x5=x4*x4

	return x5*x4*x3*x2*x1
y=power_for_x_62(2)
print(y)

