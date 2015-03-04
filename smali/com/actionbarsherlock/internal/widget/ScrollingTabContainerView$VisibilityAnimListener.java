package com.actionbarsherlock.internal.widget; class ScrollingTabContainerView$VisibilityAnimListener { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x4
a=0;//     name = "VisibilityAnimListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCanceled:Z
a=0;// 
a=0;// .field private mFinalVisibility:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 514
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mCanceled:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 1
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mCanceled:Z
a=0;// 
a=0;//     .line 540
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 2
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     iget-boolean v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mCanceled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 535
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 533
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 534
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mFinalVisibility:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 544
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 2
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 524
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 525
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->this$0:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     iput-object p1, v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->mVisibilityAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 526
a=0;//     iput-boolean v1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mCanceled:Z
a=0;// 
a=0;//     .line 527
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public withFinalVisibility(I)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;
a=0;//     .locals 0
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 518
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView$VisibilityAnimListener;->mFinalVisibility:I
a=0;// 
a=0;//     .line 519
a=0;//     return-object p0
a=0;// .end method
}}
