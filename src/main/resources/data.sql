-- Αρχικά δεδομένα. Τρέχει αυτόματα σε κάθε εκκίνηση (η H2 είναι in-memory,
-- άρα αδειάζει κάθε φορά). Τα ονόματα πινάκων/στηλών είναι πεζά όπως τα
-- φτιάχνει το Hibernate από τα entities.

-- Νομοί
INSERT INTO district (name, distcode) VALUES ('Chennai', '1');
INSERT INTO district (name, distcode) VALUES ('Coimbatore', '2');

-- Επαρχίες (distcode = σε ποιον νομό ανήκουν)
INSERT INTO taluk (name, distcode, talukcode) VALUES ('Avadi', '1', '12');
INSERT INTO taluk (name, distcode, talukcode) VALUES ('Ambattur', '1', '13');
INSERT INTO taluk (name, distcode, talukcode) VALUES ('Sulur', '2', '3');

-- Χωριά (distcode + talukcode = σε ποια επαρχία ανήκουν)
INSERT INTO village (name, distcode, talukcode, villagecode) VALUES ('Pothur', '1', '12', '15');
INSERT INTO village (name, distcode, talukcode, villagecode) VALUES ('Paruthipattu', '1', '12', '16');
INSERT INTO village (name, distcode, talukcode, villagecode) VALUES ('Korattur', '1', '13', '21');
INSERT INTO village (name, distcode, talukcode, villagecode) VALUES ('Arasur', '2', '3', '9');

-- Δρόμοι (distcode + talukcode + villagecode = σε ποιο χωριό ανήκουν)
INSERT INTO street (name, distcode, talukcode, villagecode, streetcode) VALUES ('Main Street', '1', '12', '15', '101');
INSERT INTO street (name, distcode, talukcode, villagecode, streetcode) VALUES ('Temple Street', '1', '12', '15', '102');
INSERT INTO street (name, distcode, talukcode, villagecode, streetcode) VALUES ('Market Road', '1', '12', '16', '103');
INSERT INTO street (name, distcode, talukcode, villagecode, streetcode) VALUES ('Lake View Road', '2', '3', '9', '104');
