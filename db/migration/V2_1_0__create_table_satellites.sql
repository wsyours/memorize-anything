CREATE TABLE "satellites" (
                              "id" uuid primary key ,
                              "target_id" uuid,
                              "date" timestamp,
                              "piece_to_help" varchar,
                              "description" varchar,
                              "type" varchar,
                              "status" varchar,
                              PRIMARY KEY ("id")
);