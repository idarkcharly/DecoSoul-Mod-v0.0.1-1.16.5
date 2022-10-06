Stream.of(
Block.makeCuboidShape(1, 0, 1, 15, 6, 15),
Block.makeCuboidShape(7.5, 2.5, 0.5, 8.5, 3.5, 1),
Block.makeCuboidShape(4, 6, 4, 12, 7, 12),
Block.makeCuboidShape(5.5, 6, 12, 10.5, 7, 13),
Block.makeCuboidShape(3, 6, 5.5, 4, 7, 10.5),
Block.makeCuboidShape(12, 6, 5.5, 13, 7, 10.5),
Block.makeCuboidShape(5.5, 6, 3, 10.5, 7, 4),
Block.makeCuboidShape(4.25, 7, 7.5, 4.75, 7.75, 8),
Block.makeCuboidShape(4, 7.75, 7.25, 5, 8.75, 8.25),
Block.makeCuboidShape(2, 6.5, 12.25, 3, 9, 13.25),
Block.makeCuboidShape(1.75, 6, 12, 3.25, 6.5, 13.5),
Block.makeCuboidShape(3.5, 8.25, 8.25, 4.5, 8.75, 9.25),
Block.makeCuboidShape(3, 8.25, 9.25, 4, 8.75, 10.25),
Block.makeCuboidShape(2.5, 8.25, 10.25, 3.5, 8.75, 11.25),
Block.makeCuboidShape(2, 8.25, 11.25, 3, 8.75, 12.25)
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();