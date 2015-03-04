package com.nineoldandroids.animation; class AnimatorSet$1 { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/AnimatorSet$1;
a=0;// .super Lcom/nineoldandroids/animation/AnimatorListenerAdapter;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/nineoldandroids/animation/AnimatorSet;->start()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field canceled:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;// .field private final synthetic val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/nineoldandroids/animation/AnimatorSet;Ljava/util/ArrayList;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 508
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/AnimatorListenerAdapter;-><init>()V
a=0;// 
a=0;//     .line 509
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$1;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 1
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 511
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     .line 512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 5
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     iget-boolean v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->canceled:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 515
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 516
a=0;//     .local v2, "numNodes":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 522
a=0;//     .end local v0    # "i":I
a=0;//     .end local v2    # "numNodes":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 517
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "numNodes":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->val$nodesToStart:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 518
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v3, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/Animator;->start()V
a=0;// 
a=0;//     .line 519
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$1;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/nineoldandroids/animation/AnimatorSet;->access$2(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 516
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
