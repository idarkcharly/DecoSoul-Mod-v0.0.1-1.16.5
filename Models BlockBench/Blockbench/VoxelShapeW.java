Stream.of(
Block.makeCuboidShape(1, 0, 1, 15, 6, 15),
Block.makeCuboidShape(0.5, 2.5, 7.5, 1, 3.5, 8.5),
Block.makeCuboidShape(4, 6, 4, 12, 7, 12),
Block.makeCuboidShape(12, 6, 5.5, 13, 7, 10.5),
Block.makeCuboidShape(5.5, 6, 12, 10.5, 7, 13),
Block.makeCuboidShape(5.5, 6, 3, 10.5, 7, 4),
Block.makeCuboidShape(3, 6, 5.5, 4, 7, 10.5),
Block.makeCuboidShape(7.5, 7, 11.25, 8, 7.75, 11.75),
Block.makeCuboidShape(7.25, 7.75, 11, 8.25, 8.75, 12),
Block.makeCuboidShape(12.25, 6.5, 13, 13.25, 9, 14),
Block.makeCuboidShape(12, 6, 12.75, 13.5, 6.5, 14.25),
Block.makeCuboidShape(8.25, 8.25, 11.5, 9.25, 8.75, 12.5),
Block.makeCuboidShape(9.25, 8.25, 12, 10.25, 8.75, 13),
Block.makeCuboidShape(10.25, 8.25, 12.5, 11.25, 8.75, 13.5),
Block.makeCuboidShape(11.25, 8.25, 13, 12.25, 8.75, 14)
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();