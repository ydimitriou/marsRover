package com.nvoulgaris.marsrover.commands;

import com.nvoulgaris.marsrover.Rover;

public class MoveBackwardCommand implements RoverMotionCommand {

  private Rover rover;

  public MoveBackwardCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.moveBackward();
  }
}
