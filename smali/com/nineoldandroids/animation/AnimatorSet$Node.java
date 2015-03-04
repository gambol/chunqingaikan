package com.nineoldandroids.animation; class AnimatorSet$Node { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "Node"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;// .field public dependencies:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/AnimatorSet$Dependency;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field public done:Z
a=0;// 
a=0;// .field public nodeDependencies:Ljava/util/ArrayList;
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
a=0;// .field public nodeDependents:Ljava/util/ArrayList;
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
a=0;// .field public tmpDependencies:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/animation/AnimatorSet$Dependency;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 1
a=0;//     .param p1, "animation"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 923
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 883
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 894
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->tmpDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 900
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 907
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 914
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 924
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .line 925
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addDependency(Lcom/nineoldandroids/animation/AnimatorSet$Dependency;)V
a=0;//     .locals 3
a=0;//     .param p1, "dependency"    # Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 934
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 935
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 937
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->dependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 938
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v2, p1, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 939
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependencies:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v2, p1, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 941
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p1, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;->node:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 942
a=0;//     .local v0, "dependencyNode":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v1, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 943
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 945
a=0;//     :cond_2
a=0;//     iget-object v1, v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->nodeDependents:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 946
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 951
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 952
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/Animator;);
a=0;//     invoke-virtual {v2}, Lcom/nineoldandroids/animation/Animator;->clone()Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->animation:Lcom/nineoldandroids/animation/Animator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 953
a=0;//     return-object v1
a=0;// 
a=0;//     .line 954
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 955
a=0;//     .local v0, "e":Ljava/lang/CloneNotSupportedException;
a=0;//     #v0=(Reference,Ljava/lang/CloneNotSupportedException;);
a=0;//     new-instance v2, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->clone()Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     return-object v0
a=0;// .end method
}}
