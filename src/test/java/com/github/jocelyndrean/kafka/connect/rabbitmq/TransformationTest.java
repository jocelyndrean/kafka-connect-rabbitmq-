package com.github.jocelyndrean.kafka.connect.rabbitmq;

import org.apache.kafka.connect.sink.SinkRecord;
import org.apache.kafka.connect.transforms.Transformation;
import org.junit.jupiter.api.BeforeEach;

public abstract class TransformationTest {
  final boolean isKey;
  final static String TOPIC = "test";


  protected TransformationTest(boolean isKey) {
    this.isKey = isKey;
  }

  protected abstract Transformation<SinkRecord> create();

  Transformation<SinkRecord> transformation;

  @BeforeEach
  public void before() {
    this.transformation = create();
  }


}