## Saving boolean models:

read_model -i Factory_BI.smv 
flatten_hierarchy 
encode_variables
build_boolean_model
write_boolean_model -o "Factory_BI_bool.smv"

