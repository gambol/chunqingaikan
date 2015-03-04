package com.nineoldandroids.animation; class AnimatorSet$AnimatorSetListener { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AnimatorSet.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "AnimatorSetListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/nineoldandroids/animation/AnimatorSet;Lcom/nineoldandroids/animation/AnimatorSet;)V
a=0;//     .locals 0
a=0;//     .param p2, "animatorSet"    # Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iput-object p1, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 712
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;);
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     .line 713
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 4
a=0;//     .param p1, "animation"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 716
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-boolean v2, v2, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 719
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v2}, Lcom/nineoldandroids/animation/AnimatorSet;->access$2(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 720
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v2=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v2, v2, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 721
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 722
a=0;//     .local v1, "numListeners":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 728
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "numListeners":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 723
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "numListeners":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ujava/lang/Object;);
a=0;//     iget-object v2, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     iget-object v2, v2, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v3=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-interface {v2, v3}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 722
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 9
a=0;//     .param p1, "animation"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 732
a=0;//     invoke-virtual {p1, p0}, Lcom/nineoldandroids/animation/Animator;->removeListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V
a=0;// 
a=0;//     .line 733
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v7}, Lcom/nineoldandroids/animation/AnimatorSet;->access$2(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 734
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/nineoldandroids/animation/AnimatorSet;->access$3(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     .line 735
a=0;//     .local v1, "animNode":Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, v1, Lcom/nineoldandroids/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     .line 736
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-boolean v7, v7, Lcom/nineoldandroids/animation/AnimatorSet;->mTerminated:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-static {v7}, Lcom/nineoldandroids/animation/AnimatorSet;->access$4(Lcom/nineoldandroids/animation/AnimatorSet;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 740
a=0;//     .local v5, "sortedNodes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 741
a=0;//     .local v0, "allDone":Z
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 742
a=0;//     .local v4, "numSortedNodes":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v7=(Conflicted);
a=0;//     if-lt v2, v4, :cond_2
a=0;// 
a=0;//     .line 748
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 751
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v7=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     iget-object v7, v7, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 753
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->this$0:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     iget-object v7, v7, Lcom/nineoldandroids/animation/AnimatorSet;->mListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 754
a=0;//     .local v6, "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 755
a=0;//     .local v3, "numListeners":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     if-lt v2, v3, :cond_4
a=0;// 
a=0;//     .line 759
a=0;//     .end local v3    # "numListeners":I
a=0;//     .end local v6    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {v7, v8}, Lcom/nineoldandroids/animation/AnimatorSet;->access$5(Lcom/nineoldandroids/animation/AnimatorSet;Z)V
a=0;// 
a=0;//     .line 762
a=0;//     .end local v0    # "allDone":Z
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "numSortedNodes":I
a=0;//     .end local v5    # "sortedNodes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 743
a=0;//     .restart local v0    # "allDone":Z
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "numSortedNodes":I
a=0;//     .restart local v5    # "sortedNodes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/AnimatorSet$Node;>;"
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Integer);v3=(Uninit);v4=(Integer);v5=(Reference,Ljava/util/ArrayList;);v6=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;
a=0;// 
a=0;//     iget-boolean v7, v7, Lcom/nineoldandroids/animation/AnimatorSet$Node;->done:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 744
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 745
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 742
a=0;//     :cond_3
a=0;//     #v0=(One);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 756
a=0;//     .restart local v3    # "numListeners":I
a=0;//     .restart local v6    # "tmpListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/Animator$AnimatorListener;>;"
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Integer);v6=(Reference,Ljava/util/ArrayList;);v7=(Reference,Ujava/lang/Object;);v8=(Conflicted);
a=0;//     invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Lcom/nineoldandroids/animation/Animator$AnimatorListener;
a=0;// 
a=0;//     iget-object v8, p0, Lcom/nineoldandroids/animation/AnimatorSet$AnimatorSetListener;->mAnimatorSet:Lcom/nineoldandroids/animation/AnimatorSet;
a=0;// 
a=0;//     #v8=(Reference,Lcom/nineoldandroids/animation/AnimatorSet;);
a=0;//     invoke-interface {v7, v8}, Lcom/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
a=0;// 
a=0;//     .line 755
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 766
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Lcom/nineoldandroids/animation/Animator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 770
a=0;//     return-void
a=0;// .end method
}}
