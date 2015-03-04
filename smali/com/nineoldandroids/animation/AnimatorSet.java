package com.nineoldandroids.animation; class AnimatorSet { void a() { int a;
a=0;// .class public final Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// .super Lcom/nineoldandroids/animation/Animator;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;,
a=0;//         Lcom/nineoldandroids/animation/AnimatorSet$Builder;,
a=0;//         Lcom/nineoldandroids/animation/AnimatorSet$Dependency;,
a=0;//         Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;,
a=0;//         Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;// .field private mDuration:J
a=0;// 
a=0;// .field private mNeedsSort:Z
a=0;// 
a=0;// .field private mNodeMap:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             "Lcom/nineoldandroids/animation/AnimatorSet$Node;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mNodes:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/AnimatorSet$Node;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mPlayingSet:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;// .field private mSortedNodes:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/AnimatorSet$Node;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mStartDelay:J
a=0;// 
a=0;// .field private mStarted:Z
a=0;// 
a=0;// .field mTerminated:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 45
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/Animator;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 66
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 87
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 89
a=0;//     iput-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 98
a=0;//     iput-boolean v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 104
a=0;//     iput-boolean v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 107
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     .line 110
a=0;//     iput-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 116
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     iput-wide v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/nineoldandroids/animation/AnimatorSet;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iput-boolean p1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private sortNodes()V
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 785
a=0;//     #v13=(Null);
a=0;//     iget-boolean v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_8
a=0;// 
a=0;//     .line 786
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 787
a=0;//     new-instance v9, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 788
a=0;//     .local v9, "roots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 789
a=0;//     .local v6, "numNodes":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v11=(Conflicted);
a=0;//     if-lt v1, v6, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 796
a=0;//     .local v10, "tmpRoots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-gtz v11, :cond_3
a=0;// 
a=0;//     .line 816
a=0;//     iput-boolean v13, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 817
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget-object v12, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-eq v11, v12, :cond_9
a=0;// 
a=0;//     .line 818
a=0;//     new-instance v11, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v12, "Circular dependencies cannot exist in AnimatorSet"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v11
a=0;// 
a=0;//     .line 790
a=0;//     .end local v10    # "tmpRoots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Conflicted);v12=(Uninit);
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 791
a=0;//     .local v3, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     .line 792
a=0;//     :cond_1
a=0;//     #v11=(Conflicted);
a=0;//     invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 789
a=0;//     :cond_2
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 797
a=0;//     .end local v3    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .restart local v10    # "tmpRoots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Reference,Ljava/util/ArrayList;);v11=(Integer);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 798
a=0;//     .local v7, "numRoots":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v11=(Conflicted);
a=0;//     if-lt v1, v7, :cond_4
a=0;// 
a=0;//     .line 812
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 813
a=0;//     invoke-virtual {v9, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 814
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 799
a=0;//     :cond_4
a=0;//     invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 800
a=0;//     .local v8, "root":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 801
a=0;//     iget-object v11, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v11, :cond_5
a=0;// 
a=0;//     .line 802
a=0;//     iget-object v11, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 803
a=0;//     .local v5, "numDependents":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "j":I
a=0;//     :goto_3
a=0;//     #v2=(Integer);v11=(Conflicted);
a=0;//     if-lt v2, v5, :cond_6
a=0;// 
a=0;//     .line 798
a=0;//     .end local v2    # "j":I
a=0;//     .end local v5    # "numDependents":I
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 804
a=0;//     .restart local v2    # "j":I
a=0;//     .restart local v5    # "numDependents":I
a=0;//     :cond_6
a=0;//     #v2=(Integer);v5=(Integer);
a=0;//     iget-object v11, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 805
a=0;//     .restart local v3    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 806
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-nez v11, :cond_7
a=0;// 
a=0;//     .line 807
a=0;//     invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 803
a=0;//     :cond_7
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 825
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "j":I
a=0;//     .end local v3    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .end local v5    # "numDependents":I
a=0;//     .end local v6    # "numNodes":I
a=0;//     .end local v7    # "numRoots":I
a=0;//     .end local v8    # "root":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .end local v9    # "roots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     .end local v10    # "tmpRoots":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_8
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 826
a=0;//     .restart local v6    # "numNodes":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-lt v1, v6, :cond_a
a=0;// 
a=0;//     .line 845
a=0;//     :cond_9
a=0;//     #v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 827
a=0;//     :cond_a
a=0;//     #v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v11, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 828
a=0;//     .restart local v3    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v11, :cond_b
a=0;// 
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_b
a=0;// 
a=0;//     .line 829
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 830
a=0;//     .local v4, "numDependencies":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "j":I
a=0;//     :goto_5
a=0;//     #v2=(Integer);v11=(Conflicted);
a=0;//     if-lt v2, v4, :cond_c
a=0;// 
a=0;//     .line 842
a=0;//     .end local v2    # "j":I
a=0;//     .end local v4    # "numDependencies":I
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     iput-boolean v13, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 826
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 831
a=0;//     .restart local v2    # "j":I
a=0;//     .restart local v4    # "numDependencies":I
a=0;//     :cond_c
a=0;//     #v2=(Integer);v4=(Integer);
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 832
a=0;//     .local v0, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-nez v11, :cond_d
a=0;// 
a=0;//     .line 833
a=0;//     new-instance v11, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 835
a=0;//     :cond_d
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v12, v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v12=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v11, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_e
a=0;// 
a=0;//     .line 836
a=0;//     iget-object v11, v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v12, v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 830
a=0;//     :cond_e
a=0;//     #v11=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancel()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/AnimatorSet;->isStarted()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     .local v2, "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .end local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 289
a=0;//     .restart local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/ValueAnimator;->isRunning()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/ValueAnimator;->cancel()V
a=0;// 
a=0;//     .line 302
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 307
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 309
a=0;//     .end local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 289
a=0;//     .restart local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Reference,Ljava/util/ArrayList;);v3=(Reference,Ljava/util/Iterator;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 290
a=0;//     .local v0, "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     invoke-interface {v0, p0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 297
a=0;//     .end local v0    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 299
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v4, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v4}, Lcom/nineoldandroids/animation/Animator;->cancel()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 303
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 304
a=0;//     .restart local v0    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     invoke-interface {v0, p0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Lcom/nineoldandroids/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/AnimatorSet;->clone()Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/AnimatorSet;
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 551
a=0;//     #v13=(Null);
a=0;//     invoke-super {p0}, Lcom/nineoldandroids/animation/Animator;->clone()Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .line 560
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/AnimatorSet;
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     iput-boolean v10, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 561
a=0;//     iput-boolean v11, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 562
a=0;//     iput-boolean v11, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 563
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v10, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 564
a=0;//     new-instance v10, Ljava/util/HashMap;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v10}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v10, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 565
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v10, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 566
a=0;//     new-instance v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v10, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 571
a=0;//     new-instance v9, Ljava/util/HashMap;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v9}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 572
a=0;//     .local v9, "nodeCloneMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Lcom/nineoldandroids/animation/AnimatorSet$Node;Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     #v9=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v10, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Reference,Ujava/lang/Object;);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     .line 604
a=0;//     iget-object v10, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     .line 616
a=0;//     return-object v0
a=0;// 
a=0;//     .line 572
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 573
a=0;//     .local v7, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     invoke-virtual {v7}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->clone()Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 574
a=0;//     .local v8, "nodeClone":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v8=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v9, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v11, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 576
a=0;//     iget-object v11, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodeMap:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v12, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v12=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v11, v12, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 578
a=0;//     iput-object v13, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 579
a=0;//     iput-object v13, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 580
a=0;//     iput-object v13, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 581
a=0;//     iput-object v13, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 584
a=0;//     iget-object v11, v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v11}, Lcom/nineoldandroids/animation/Animator;->getListeners()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 585
a=0;//     .local v2, "cloneListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 586
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 587
a=0;//     .local v6, "listenersToRemove":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);v12=(Conflicted);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_4
a=0;// 
a=0;//     .line 595
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 596
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     if-eqz v12, :cond_0
a=0;// 
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 597
a=0;//     .local v5, "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 587
a=0;//     .end local v5    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 588
a=0;//     .restart local v5    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     instance-of v12, v5, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     if-eqz v12, :cond_3
a=0;// 
a=0;//     .line 589
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 590
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v6    # "listenersToRemove":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 592
a=0;//     .restart local v6    # "listenersToRemove":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_5
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 604
a=0;//     .end local v2    # "cloneListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     .end local v5    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     .end local v6    # "listenersToRemove":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     .end local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .end local v8    # "nodeClone":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v11=(Boolean);v12=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 605
a=0;//     .restart local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 606
a=0;//     .restart local v8    # "nodeClone":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v11, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v11, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 608
a=0;//     .local v4, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     iget-object v12, v4, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v12=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v9, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 609
a=0;//     .local v3, "clonedDependencyNode":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 610
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     iget v12, v4, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->rule:I
a=0;// 
a=0;//     .line 609
a=0;//     #v12=(Integer);
a=0;//     invoke-direct {v1, v3, v12}, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;-><init>(Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 611
a=0;//     .local v1, "cloneDependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v8, v1}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->addDependency(Lcom/nineoldandroids/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public end()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/AnimatorSet;->isStarted()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 323
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/AnimatorSet;->sortNodes()V
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcom/nineoldandroids/animation/ValueAnimator;->cancel()V
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 339
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 342
a=0;//     .local v2, "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     .line 346
a=0;//     .end local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 348
a=0;//     :cond_4
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 324
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Reference,Ljava/util/Iterator;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 325
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v4, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v4, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-direct {v4, p0, p0}, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;-><init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/AnimatorSet;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     iput-object v4, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 328
a=0;//     :cond_6
a=0;//     iget-object v4, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v5=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-virtual {v4, v5}, Lcom/nineoldandroids/animation/Animator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v4=(Boolean);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 336
a=0;//     .restart local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v4, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v4=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v4}, Lcom/nineoldandroids/animation/Animator;->end()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 342
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .restart local v2    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/util/ArrayList;);v4=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 343
a=0;//     .local v0, "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     invoke-interface {v0, p0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public getChildAnimations()Ljava/util/ArrayList;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "childList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     return-object v0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 202
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v3, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getStartDelay()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     iget-wide v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isRunning()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 362
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 357
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 358
a=0;//     .local v0, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Animator;->isRunning()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isStarted()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     iget-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .locals 1
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;-><init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 272
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public playSequentially(Ljava/util/List;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "items":Ljava/util/List;, "Ljava/util/List<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 179
a=0;//     #v2=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 181
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 184
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->before(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 184
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs playSequentially([Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 3
a=0;//     .param p1, "items"    # [Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 160
a=0;//     #v2=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 162
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v1, p1, v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 170
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 165
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);
a=0;//     array-length v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     aget-object v1, p1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->before(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 165
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public playTogether(Ljava/util/Collection;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/Animator;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     .local p1, "items":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/nineoldandroids/animation/Animator;>;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     .local v1, "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v1=(Null);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     .end local v1    # "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 143
a=0;//     .restart local v1    # "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     :cond_1
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);v2=(Reference,Ljava/util/Iterator;);v3=(Boolean);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 144
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/Animator;
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 146
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     :cond_2
a=0;//     invoke-virtual {v1, v0}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public varargs playTogether([Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 3
a=0;//     .param p1, "items"    # [Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNeedsSort:Z
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/nineoldandroids/animation/AnimatorSet;->play(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 129
a=0;//     .restart local v0    # "builder":Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);v1=(Integer);v2=(Integer);
a=0;//     aget-object v2, p1, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v2}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 128
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setDuration(J)Lcom/nineoldandroids/animation/Animator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/nineoldandroids/animation/AnimatorSet;->setDuration(J)Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setDuration(J)Lcom/nineoldandroids/animation/AnimatorSet;
a=0;//     .locals 3
a=0;//     .param p1, "duration"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 416
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "duration must be a value of zero or greater"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v1=(Byte);v2=(LongHi);
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 423
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mDuration:J
a=0;// 
a=0;//     .line 424
a=0;//     return-object p0
a=0;// 
a=0;//     .line 418
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 421
a=0;//     .local v0, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2, p1, p2}, Lcom/nineoldandroids/animation/Animator;->setDuration(J)Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 3
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 237
a=0;//     return-void
a=0;// 
a=0;//     .line 234
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 235
a=0;//     .local v0, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2, p1}, Lcom/nineoldandroids/animation/Animator;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setStartDelay(J)V
a=0;//     .locals 0
a=0;//     .param p1, "startDelay"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     iput-wide p1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     .line 390
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTarget(Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;//     .param p1, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 224
a=0;//     return-void
a=0;// 
a=0;//     .line 216
a=0;//     :cond_1
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 217
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v0, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 218
a=0;//     .local v0, "animation":Lcom/nineoldandroids/animation/Animator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     instance-of v3, v0, Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 219
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .end local v0    # "animation":Lcom/nineoldandroids/animation/Animator;
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     .restart local v0    # "animation":Lcom/nineoldandroids/animation/Animator;
a=0;//     :cond_2
a=0;//     instance-of v3, v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 221
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/ObjectAnimator;
a=0;// 
a=0;//     .end local v0    # "animation":Lcom/nineoldandroids/animation/Animator;
a=0;//     invoke-virtual {v0, p1}, Lcom/nineoldandroids/animation/ObjectAnimator;->setTarget(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupEndValues()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 439
a=0;//     return-void
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 437
a=0;//     .local v0, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Animator;->setupEndValues()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setupStartValues()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 432
a=0;//     return-void
a=0;// 
a=0;//     .line 429
a=0;//     :cond_0
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 430
a=0;//     .local v0, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Animator;->setupStartValues()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public start()V
a=0;//     .locals 18
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     iput-boolean v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     .line 452
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 456
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/nineoldandroids/animation/AnimatorSet;->sortNodes()V
a=0;// 
a=0;//     .line 458
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 459
a=0;//     .local v11, "numSortedNodes":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     if-lt v4, v11, :cond_2
a=0;// 
a=0;//     .line 480
a=0;//     new-instance v8, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 481
a=0;//     .local v8, "nodesToStart":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v9=(Conflicted);v16=(Conflicted);
a=0;//     if-lt v4, v11, :cond_7
a=0;// 
a=0;//     .line 500
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     const-wide/16 v16, 0x0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     cmp-long v14, v14, v16
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gtz v14, :cond_d
a=0;// 
a=0;//     .line 501
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     :goto_2
a=0;//     #v14=(Reference,Ljava/util/Iterator;);v15=(Conflicted);v16=(Conflicted);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_c
a=0;// 
a=0;//     .line 526
a=0;//     :goto_3
a=0;//     #v15=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v14, :cond_0
a=0;// 
a=0;//     .line 528
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 529
a=0;//     .local v13, "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 530
a=0;//     .local v10, "numListeners":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     if-lt v4, v10, :cond_e
a=0;// 
a=0;//     .line 534
a=0;//     .end local v10    # "numListeners":I
a=0;//     .end local v13    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_0
a=0;//     #v10=(Conflicted);v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-nez v14, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     const-wide/16 v16, 0x0
a=0;// 
a=0;//     #v16=(LongLo);
a=0;//     cmp-long v14, v14, v16
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_1
a=0;// 
a=0;//     .line 537
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStarted:Z
a=0;// 
a=0;//     .line 538
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v14, :cond_1
a=0;// 
a=0;//     .line 540
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 541
a=0;//     .restart local v13    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 542
a=0;//     .restart local v10    # "numListeners":I
a=0;//     #v10=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     if-lt v4, v10, :cond_f
a=0;// 
a=0;//     .line 547
a=0;//     .end local v10    # "numListeners":I
a=0;//     .end local v13    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 460
a=0;//     .end local v8    # "nodesToStart":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v3=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 462
a=0;//     .local v7, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/nineoldandroids/animation/Animator;->getListeners()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 463
a=0;//     .local v12, "oldListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v12, :cond_4
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-lez v14, :cond_4
a=0;// 
a=0;//     .line 465
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 464
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     .line 467
a=0;//     .local v2, "clonedListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_6
a=0;//     #v14=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_5
a=0;// 
a=0;//     .line 459
a=0;//     .end local v2    # "clonedListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     .restart local v2    # "clonedListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_5
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);v14=(Reference,Ljava/util/Iterator;);v15=(Boolean);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     .line 468
a=0;//     .local v6, "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     instance-of v15, v6, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;
a=0;// 
a=0;//     if-nez v15, :cond_6
a=0;// 
a=0;//     .line 469
a=0;//     instance-of v15, v6, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     if-eqz v15, :cond_3
a=0;// 
a=0;//     .line 470
a=0;//     :cond_6
a=0;//     iget-object v15, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v15=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v15, v6}, Lcom/nineoldandroids/animation/Animator;->removeListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 482
a=0;//     .end local v2    # "clonedListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     .end local v6    # "listener":Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;//     .end local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .end local v12    # "oldListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     .restart local v8    # "nodesToStart":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/util/ArrayList;);v9=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSortedNodes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 483
a=0;//     .restart local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     if-nez v14, :cond_8
a=0;// 
a=0;//     .line 484
a=0;//     new-instance v14, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v14=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-direct {v14, v0, v1}, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;-><init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/AnimatorSet;)V
a=0;// 
a=0;//     #v14=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     .line 486
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v14, :cond_9
a=0;// 
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-nez v14, :cond_a
a=0;// 
a=0;//     .line 487
a=0;//     :cond_9
a=0;//     #v14=(Conflicted);
a=0;//     invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 497
a=0;//     :goto_7
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v14=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mSetListener:Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// 
a=0;//     #v15=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     invoke-virtual {v14, v15}, Lcom/nineoldandroids/animation/Animator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 481
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 489
a=0;//     :cond_a
a=0;//     #v14=(Integer);v15=(Conflicted);
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 490
a=0;//     .local v9, "numDependencies":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "j":I
a=0;//     :goto_8
a=0;//     #v5=(Integer);
a=0;//     if-lt v5, v9, :cond_b
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     check-cast v14, Ljava/util/ArrayList;
a=0;// 
a=0;//     iput-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 491
a=0;//     :cond_b
a=0;//     iget-object v14, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .line 492
a=0;//     .local v3, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     iget-object v14, v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iget-object v14, v14, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 493
a=0;//     new-instance v15, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;);
a=0;//     iget v0, v3, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->rule:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v15, v0, v7, v1}, Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;-><init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 492
a=0;//     #v15=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$DependencyListener;);
a=0;//     invoke-virtual {v14, v15}, Lcom/nineoldandroids/animation/Animator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 490
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 501
a=0;//     .end local v3    # "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     .end local v5    # "j":I
a=0;//     .end local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .end local v9    # "numDependencies":I
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v9=(Conflicted);v15=(Boolean);v16=(Conflicted);v17=(LongHi);
a=0;//     invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 502
a=0;//     .restart local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v15, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v15=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v15}, Lcom/nineoldandroids/animation/Animator;->start()V
a=0;// 
a=0;//     .line 503
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mPlayingSet:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v0, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 506
a=0;//     .end local v7    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     :cond_d
a=0;//     #v7=(Conflicted);v14=(Byte);v15=(LongHi);v16=(LongLo);
a=0;//     const/4 v14, 0x2
a=0;// 
a=0;//     #v14=(PosByte);
a=0;//     new-array v14, v14, [F
a=0;// 
a=0;//     #v14=(Reference,[F);
a=0;//     fill-array-data v14, :array_0
a=0;// 
a=0;//     invoke-static {v14}, Lcom/nineoldandroids/animation/ValueAnimator;->ofFloat([F)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 507
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v15, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mStartDelay:J
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     invoke-virtual/range {v14 .. v16}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 508
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     new-instance v15, Lcom/nineoldandroids/animation/AnimatorSet$1;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v15, v0, v8}, Lcom/nineoldandroids/animation/AnimatorSet$1;-><init>(Lcom/nineoldandroids/animation/AnimatorSet;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v15=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$1;);
a=0;//     invoke-virtual {v14, v15}, Lcom/nineoldandroids/animation/ValueAnimator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 524
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/nineoldandroids/animation/AnimatorSet;->mDelayAnim:Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/nineoldandroids/animation/ValueAnimator;->start()V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 531
a=0;//     .restart local v10    # "numListeners":I
a=0;//     .restart local v13    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_e
a=0;//     #v10=(Integer);v13=(Reference,Ljava/util/ArrayList;);v15=(Conflicted);v16=(Conflicted);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     check-cast v14, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-interface {v14, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 530
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 543
a=0;//     :cond_f
a=0;//     #v15=(LongHi);v16=(LongLo);
a=0;//     invoke-virtual {v13, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     check-cast v14, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-interface {v14, v0}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 542
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 506
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
}}
