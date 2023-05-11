CREATE TABLE "targets" (
                           "id" uuid primary key ,
                           "date" timestamp,
                           "piece_to_memorize" varchar,
                           "description" varchar,
                           "type" varchar,
                           "status" varchar,
                           PRIMARY KEY ("id")
);