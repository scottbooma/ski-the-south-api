TRUNCATE resort;

INSERT INTO resort (
    id, 
    name, 
    location, 
    image_url, 
    label, 
    elevation, 
    vertical, 
    acres, 
    trails, 
    lifts,
    snow_report_url
) VALUES (
    288,
    'Cataloochee Ski Area', 
    'Maggie Valley, NC', 
    'cataloochee-logo.png', 
    'cataloochee', 
    '5,400''', 
    '740''', 
    50, 
    18, 
    5,
    'https://cataloochee.com/the-mountain/snow-report/'
),(
    287,
    'Beech Mountain Resort',
    'Beech Mountain, NC', 
    'beech-logo.png', 
    'beech', 
    '5,506''', 
    '830''', 
    95, 
    17, 
    8,
    'https://cataloochee.com/the-mountain/snow-report/'
),(
    290, 
    'Sugar Mountain Resort', 
    'Banner Elk, NC', 
    'sugar-logo.png', 
    'sugar', 
    '5,300''', 
    '1,200''', 
    125, 
    21, 
    8,
    'https://cataloochee.com/the-mountain/snow-report/'
);