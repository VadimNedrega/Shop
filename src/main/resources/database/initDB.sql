create table category
(
    id   int8 generated by default as identity,
    name varchar(255),
    primary key (id)
);
create table client
(
    id         int8 generated by default as identity,
    email      varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    phone      varchar(255),
    primary key (id)
);
create table client_order
(
    id               int8 generated by default as identity,
    created          timestamp,
    delivery_details varchar(255),
    order_details    varchar(255),
    status           varchar(255),
    updated          timestamp,
    client_id        int8,
    primary key (id)
);
create table client_order_product_list
(
    client_order_id int8 not null,
    product_list_id int8 not null
);
create table product
(
    id           int8 generated by default as identity,
    color        varchar(255),
    details      varchar(255),
    manufacturer varchar(255),
    name         varchar(255),
    price        float8,
    size         varchar(255),
    primary key (id)
);
create table product_category
(
    category_id int8,
    product_id  int8 not null,
    primary key (product_id)
);
alter table if exists client_order_product_list
    add constraint UK_d6t65acfgtkqsmd4jtqeihhtn unique (product_list_id);
alter table if exists client_order
    add constraint FKcggjtc9f3otuprl7takbttwuk foreign key (client_id) references client;
alter table if exists client_order_product_list
    add constraint FK3n4ixmkv77n4h5p3k4sdjwwrl foreign key (product_list_id) references product;
alter table if exists client_order_product_list
    add constraint FKamj7uvfmw4e779e4pskjat6ti foreign key (client_order_id) references client_order;
alter table if exists product_category
    add constraint FKkud35ls1d40wpjb5htpp14q4e foreign key (category_id) references category;
alter table if exists product_category
    add constraint FK2k3smhbruedlcrvu6clued06x foreign key (product_id) references product