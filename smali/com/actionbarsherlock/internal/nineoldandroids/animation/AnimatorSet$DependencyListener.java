package com.actionbarsherlock.internal.nineoldandroids.animation; class AnimatorSet$DependencyListener { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DependencyListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimatorSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;// .field private mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;// .field private mRule:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;//     .locals 0
a=0;//     .param p1, "animatorSet"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;//     .param p2, "node"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .param p3, "rule"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 635
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .line 636
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 637
a=0;//     iput p3, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I
a=0;// 
a=0;//     .line 638
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private startIfReady(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 6
a=0;//     .param p1, "dependencyAnimation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 679
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-boolean v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 702
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 683
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 684
a=0;//     .local v1, "dependencyToRemove":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     #v1=(Null);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 685
a=0;//     .local v3, "numDependencies":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-lt v2, v3, :cond_2
a=0;// 
a=0;//     .line 696
a=0;//     :goto_2
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 697
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 699
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->start()V
a=0;// 
a=0;//     .line 700
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mAnimatorSet:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->access$2(Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v5=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v5, v5, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 686
a=0;//     :cond_2
a=0;//     #v1=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mNode:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 687
a=0;//     .local v0, "dependency":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     iget v4, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;->rule:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     .line 688
a=0;//     iget-object v4, v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v4, v4, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     if-ne v4, p1, :cond_3
a=0;// 
a=0;//     .line 691
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 692
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {p1, p0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->removeListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 685
a=0;//     :cond_3
a=0;//     #v1=(Null);v4=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 2
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 652
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 653
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->startIfReady(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 655
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 661
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;//     .locals 1
a=0;//     .param p1, "animation"    # Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->mRule:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 668
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$DependencyListener;->startIfReady(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 670
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
