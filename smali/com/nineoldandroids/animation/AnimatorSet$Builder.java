package com.nineoldandroids.animation; class AnimatorSet$Builder { void a() { int a;
a=0;// .class public Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 2
a=0;//     .param p2, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1027
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1028
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Builder;);
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1029
a=0;//     iget-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1030
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v0, p2}, Lcom/nineoldandroids/animation/AnimatorSet$Node;-><init>(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iput-object v0, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1031
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1032
a=0;//     invoke-static {p1}, Lcom/nineoldandroids/animation/AnimatorSet;->access$6(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public after(J)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .locals 2
a=0;//     .param p1, "delay"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 1105
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     fill-array-data v1, :array_0
a=0;// 
a=0;//     invoke-static {v1}, Lcom/nineoldandroids/animation/ValueAnimator;->ofFloat([F)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1106
a=0;//     .local v0, "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 1107
a=0;//     invoke-virtual {p0, v0}, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->after(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;// 
a=0;//     .line 1108
a=0;//     return-object p0
a=0;// 
a=0;//     .line 1105
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3f800000    # 1.0f
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public after(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .locals 3
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1084
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1085
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1086
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v1, p1}, Lcom/nineoldandroids/animation/AnimatorSet$Node;-><init>(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 1087
a=0;//     .restart local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1088
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$6(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1090
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;-><init>(Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1091
a=0;//     .local v0, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-virtual {v2, v0}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->addDependency(Lcom/nineoldandroids/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1092
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public before(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .locals 4
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1064
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1065
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1066
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v1, p1}, Lcom/nineoldandroids/animation/AnimatorSet$Node;-><init>(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 1067
a=0;//     .restart local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1068
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$6(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;-><init>(Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1071
a=0;//     .local v0, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v1, v0}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->addDependency(Lcom/nineoldandroids/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1072
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public with(Lcom/nineoldandroids/animation/Animator;)Lcom/nineoldandroids/animation/AnimatorSet$Builder;
a=0;//     .locals 4
a=0;//     .param p1, "anim"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1044
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 1045
a=0;//     .local v1, "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1046
a=0;//     new-instance v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .end local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     invoke-direct {v1, p1}, Lcom/nineoldandroids/animation/AnimatorSet$Node;-><init>(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 1047
a=0;//     .restart local v1    # "node":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     #v1=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Node;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1048
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$6(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1050
a=0;//     :cond_0
a=0;//     new-instance v0, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$Builder;->mCurrentNode:Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v0, v2, v3}, Lcom/nineoldandroids/animation/AnimatorSet$Dependency;-><init>(Lcom/nineoldandroids/animation/AnimatorSet$Node;I)V
a=0;// 
a=0;//     .line 1051
a=0;//     .local v0, "dependency":Lcom/nineoldandroids/animation/AnimatorSet$Dependency;
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$Dependency;);
a=0;//     invoke-virtual {v1, v0}, Lcom/nineoldandroids/animation/AnimatorSet$Node;->addDependency(Lcom/nineoldandroids/animation/AnimatorSet$Dependency;)V
a=0;// 
a=0;//     .line 1052
a=0;//     return-object p0
a=0;// .end method
}}
