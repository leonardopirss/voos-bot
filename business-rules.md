### BOT VOOS 

# SEARCH IN API SKICANNER, VOOS SELECTED USER.
# Execute search Job a each 1 hour during the day
# COMMUNICATION WHATSAPP, SELECTED VOOS, PERIODS, ORIGIN, DESTINATION


# SCHEDULER FUNCTION FINDBYVOOSUSER

src /
controller /
repository /
service /
entity /
enums /
dto / 
mapper /
config / security / auth / filter
resources / yml 


DATABASE 

CREATE TABLE USER {
    ID,
    NOME,
    EMAIL,
    NUMBER
}

## Table armazena preferences voos, day, hour, origin, destination
# air company if possible! 
CREATE TABLE PREFERENCES {
    id NUMBER (0,10),
    id_user NUMBER (0,10),
    dt_initial DATE,
    dt_final DATE,
    origin VARCHAR(10),
    destination VARCHAR(10),
    AIR_COMPANY VARCHAR (20)
}
