# control program for a robot. 
The robot is located in a two-dimensional
room with the following signature:
{
getStartPosition: function() {...}, // returns a point
contains: function(point) {...} // returns a bool
}
Point is an object representing a two-dimensional point in the room. You don’t have to use this exact
“interface” for the room, if you have a better one in mind, feel free to use that instead.

The robot moves around in the room by parsing a string of commands in Swedish:
V - Turn left (vänster) H - Turn right (höger) G - Move forward (gå)
Example string: VGGHGHGHGG

It shall also be possible to configure the robot to use commands in English:
L - Turn left R - Turn right F - Move forward
Example string: LFFRFRFRFF

When the robot runs out of commands, it shall report what square (x,y) it’s located at, and what
direction it’s facing. When the program starts, the robot is always facing North​.
Example 1:
Starting the program with a square 5x5 room, and start position (1,2)
The instructions “HGHGGHGHG” will result in the report “1 3 N”
