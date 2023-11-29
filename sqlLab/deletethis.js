function a() {
    console.log("a");
    var b = () => console.log("b");
    return b;
}

c = a();