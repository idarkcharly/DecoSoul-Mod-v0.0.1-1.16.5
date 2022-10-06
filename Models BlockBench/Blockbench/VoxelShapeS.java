Stream.of(
Block.makeCuboidShape(1, 0, 1, 15, 6, 15),
Block.makeCuboidShape(7.5, 2.5, 15, 8.5, 3.5, 15.5),
Block.makeCuboidShape(4, 6, 4, 12, 7, 12),
Block.makeCuboidShape(5.5, 6, 3, 10.5, 7, 4),
Block.makeCuboidShape(12, 6, 5.5, 13, 7, 10.5),
Block.makeCuboidShape(3, 6, 5.5, 4, 7, 10.5),
Block.makeCuboidShape(5.5, 6, 12, 10.5, 7, 13),
Block.makeCuboidShape(11.25, 7, 8, 11.75, 7.75, 8.5),
Block.makeCuboidShape(11, 7.75, 7.75, 12, 8.75, 8.75),
Block.makeCuboidShape(13, 6.5, 2.75, 14, 9, 3.75),
Block.makeCuboidShape(12.75, 6, 2.5, 14.25, 6.5, 4),
Block.makeCuboidShape(11.5, 8.25, 6.75, 12.5, 8.75, 7.75),
Block.makeCuboidShape(12, 8.25, 5.75, 13, 8.75, 6.75),
Block.makeCuboidShape(12.5, 8.25, 4.75, 13.5, 8.75, 5.75),
Block.makeCuboidShape(13, 8.25, 3.75, 14, 8.75, 4.75)
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();