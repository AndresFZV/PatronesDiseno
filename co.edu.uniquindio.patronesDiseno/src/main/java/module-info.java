module patronesDiseno {
    opens co.edu.uniquindio.patronesDiseno;
    exports co.edu.uniquindio.patronesDiseno;

    opens co.edu.uniquindio.patronesDiseno.FactoryMethod.factory;
    exports co.edu.uniquindio.patronesDiseno.FactoryMethod.factory;
    opens co.edu.uniquindio.patronesDiseno.FactoryMethod.services;
    exports co.edu.uniquindio.patronesDiseno.FactoryMethod.services;
    opens co.edu.uniquindio.patronesDiseno.FactoryMethod.model;
    exports co.edu.uniquindio.patronesDiseno.FactoryMethod.model;

    opens co.edu.uniquindio.patronesDiseno.AbstracFactory;
    exports co.edu.uniquindio.patronesDiseno.AbstracFactory;

    opens co.edu.uniquindio.patronesDiseno.AbstracFactory.factory;
    exports co.edu.uniquindio.patronesDiseno.AbstracFactory.factory;

    opens co.edu.uniquindio.patronesDiseno.AbstracFactory.model;
    exports co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

    opens co.edu.uniquindio.patronesDiseno.AbstracFactory.services;
    exports co.edu.uniquindio.patronesDiseno.AbstracFactory.services;

}