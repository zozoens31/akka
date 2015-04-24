/**
 * Copyright (C) 2015 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.stream.testkit.scaladsl

import akka.stream._
import akka.stream.impl._
import akka.stream.OperationAttributes.none
import akka.stream.scaladsl._
import akka.stream.testkit._

import akka.actor.ActorSystem;

/**
 * Factory methods for test sinks.
 */
object TestSink {

  /**
   * A Sink that materialized to a [[TestSubscriber.Probe]].
   */
  def probe[T]()(implicit system: ActorSystem) = new Sink[T, TestSubscriber.Probe[T]](new StreamTestKit.ProbeSink(none, SinkShape(new Inlet("ProbeSink.in"))))

}
