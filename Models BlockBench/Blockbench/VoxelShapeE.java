Stream.of(
Block.makeCuboidShape(1, 0, 1, 15, 6, 15),
Block.makeCuboidShape(15, 2.5, 7.5, 15.5, 3.5, 8.5),
Block.makeCuboidShape(4, 6, 4, 12, 7, 12),
Block.makeCuboidShape(3, 6, 5.5, 4, 7, 10.5),
Block.makeCuboidShape(5.5, 6, 3, 10.5, 7, 4),
Block.makeCuboidShape(5.5, 6, 12, 10.5, 7, 13),
Block.makeCuboidShape(12, 6, 5.5, 13, 7, 10.5),
Block.makeCuboidShape(8, 7, 4.25, 8.5, 7.75, 4.75),
Block.makeCuboidShape(7.75, 7.75, 4, 8.75, 8.75, 5),
Block.makeCuboidShape(2.75, 6.5, 2, 3.75, 9, 3),
Block.makeCuboidShape(2.5, 6, 1.75, 4, 6.5, 3.25),
Block.makeCuboidShape(6.75, 8.25, 3.5, 7.75, 8.75, 4.5),
Block.makeCuboidShape(5.75, 8.25, 3, 6.75, 8.75, 4),
Block.makeCuboidShape(4.75, 8.25, 2.5, 5.75, 8.75, 3.5),
Block.makeCuboidShape(3.75, 8.25, 2, 4.75, 8.75, 3)
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();