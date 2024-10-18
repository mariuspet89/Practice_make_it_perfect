
			This GroupingService class provides functionality for grouping fields in a converted format. 
			Here's a brief explanation of the groupings performed in this class:

		groupPerLineByKey: This groups fields horizontaly on the same line based on their keys. 
		It checks for pairs of fields that have the last three suffixes matching in their keys(name).
		If a pair is found, a unique group ID is generated, and both fields are assigned the same group ID. 
		A group is created with a layout type of "hbox," and the fields are added to the group. 
		The grouped line replaces the original line in the converted format.

		groupPerColumn: This groups fields vertically by column.
		It compares the fields in the current line with the fields in the next line. 
		If a pair of fields is found with matching keys and x-coordinates, a unique group ID is generated, 
		and both fields are assigned the same group ID.
		A group is created with a layout type of "vbox," and the pair field is added to the group.
		The grouped lines replace the original lines in the converted format.

		groupPerLineByPosition: This groups fields horizontaly on the same line based on their positions.
		It identifies a group starter field, which is a label field that either starts with color WHT or attribute HI. 
		It then looks for consecutive fields on the same line that are not already part of a group and not group starters. 
		If a sequence of consecutive fields is found, a unique group ID is generated,
		and all fields in the sequence are assigned the same group ID. 
		A group is created with a layout type of "hbox," and the fields are added to the group.
		The grouped line replaces the original line in the converted format.

		These groupings help organize related fields together, 
		allowing for easier visualization and manipulation of the converted format data.