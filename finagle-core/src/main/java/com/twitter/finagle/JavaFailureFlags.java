package com.twitter.finagle;

import java.util.Set;

import scala.collection.JavaConversions;

/**
 * Java compatibility for the {@link FailureFlags} companion object.
 */
public final class JavaFailureFlags {
  private JavaFailureFlags() {
    throw new IllegalStateException();
  }

  /** See `FailureFlags.Empty` */
  public static final long EMPTY = FailureFlags$.MODULE$.Empty();

  /** See `FailureFlags.Retryable` */
  public static final long RETRYABLE = FailureFlags$.MODULE$.Retryable();

  /** See `FailureFlags.Interrupted` */
  public static final long INTERRUPTED = FailureFlags$.MODULE$.Interrupted();

  /** See `FailureFlags.Rejected` */
  public static final long REJECTED = FailureFlags$.MODULE$.Rejected();

  /** See `FailureFlags.NonRetryable` */
  public static final long NON_RETRYABLE = FailureFlags$.MODULE$.NonRetryable();

  /** See `FailureFlags.Ignorable` */
  public static final long IGNORABLE = FailureFlags$.MODULE$.Ignorable();

  /** See `FailureFlags.DeadlineExceeded` */
  public static final long DEADLINE_EXCEEDED = FailureFlags$.MODULE$.DeadlineExceeded();

  /** See `FailureFlags.flagsOf` */
  public static Set<String> flagsOf(long flags) {
    return JavaConversions.setAsJavaSet(FailureFlags$.MODULE$.flagsOf(flags));
  }

  /** See `FailureFlags.flagsOf` */
  public static Set<String> flagsOf(Throwable t) {
    return JavaConversions.setAsJavaSet(FailureFlags$.MODULE$.flagsOf(t));
  }

  /** See `FailureFlags.isFlagged` */
  public static boolean isFlagged(long flags, Throwable t) {
    return FailureFlags$.MODULE$.isFlagged(flags, t);
  }

}
