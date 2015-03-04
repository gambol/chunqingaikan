package com.nineoldandroids.animation; class TimeAnimator { void a() { int a;
a=0;// .class public Lcom/nineoldandroids/animation/TimeAnimator;
a=0;// .super Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// .source "TimeAnimator.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;// 
a=0;// .field private mPreviousTime:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/TimeAnimator;);
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J
a=0;// 
a=0;//     .line 12
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method animateValue(F)V
a=0;//     .locals 0
a=0;//     .param p1, "fraction"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method animationFrame(J)Z
a=0;//     .locals 6
a=0;//     .param p1, "currentTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     .line 19
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPlayingState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPlayingState:I
a=0;// 
a=0;//     .line 21
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     .line 22
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 30
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sub-long v2, p1, v0
a=0;// 
a=0;//     .line 31
a=0;//     .local v2, "totalTime":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J
a=0;// 
a=0;//     cmp-long v0, v0, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_3
a=0;// 
a=0;//     .line 32
a=0;//     .local v4, "deltaTime":J
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J
a=0;// 
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/TimeAnimator;);
a=0;//     invoke-interface/range {v0 .. v5}, Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;->onTimeUpdate(Lcom/nineoldandroids/animation/TimeAnimator;JJ)V
a=0;// 
a=0;//     .line 35
a=0;//     .end local v2    # "totalTime":J
a=0;//     .end local v4    # "deltaTime":J
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     .line 24
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Uninit);v3=(Uninit);
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     sub-long v0, p1, v0
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mStartTime:J
a=0;// 
a=0;//     .line 26
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mSeekTime:J
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 31
a=0;//     .restart local v2    # "totalTime":J
a=0;//     :cond_3
a=0;//     #v0=(Byte);v2=(LongLo);v3=(LongHi);
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mPreviousTime:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     sub-long v4, p1, v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method initAnimation()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTimeListener(Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/TimeAnimator;->mListener:Lcom/nineoldandroids/animation/TimeAnimator$TimeListener;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
}}
