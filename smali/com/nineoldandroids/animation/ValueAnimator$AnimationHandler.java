package com.nineoldandroids.animation; class ValueAnimator$AnimationHandler { void a() { int a;
a=0;// .class Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;
a=0;// .super Landroid/os/Handler;
a=0;// .source "ValueAnimator.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "AnimationHandler"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-direct {p0}, Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 26
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 586
a=0;//     .local v6, "callAgain":Z
a=0;//     #v6=(One);
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$2()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 587
a=0;//     .local v5, "animations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$3()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 588
a=0;//     .local v10, "delayedAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iget v0, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     packed-switch v19, :pswitch_data_0
a=0;// 
a=0;//     .line 682
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 592
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$4()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v16, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 593
a=0;//     .local v16, "pendingAnimations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-gtz v19, :cond_1
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     if-lez v19, :cond_2
a=0;// 
a=0;//     .line 594
a=0;//     :cond_1
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 601
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v6=(Boolean);v7=(Conflicted);v12=(Conflicted);v17=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     if-gtz v19, :cond_6
a=0;// 
a=0;//     .line 620
a=0;//     .end local v16    # "pendingAnimations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     :pswitch_1
a=0;//     #v16=(Conflicted);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     .line 621
a=0;//     .local v8, "currentTime":J
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$7()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v18, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 622
a=0;//     .local v18, "readyAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$8()Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v19 .. v19}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 626
a=0;//     .local v11, "endingAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 627
a=0;//     .local v14, "numDelayedAnims":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "i":I
a=0;//     :goto_1
a=0;//     #v12=(Integer);v19=(Conflicted);
a=0;//     if-lt v12, v14, :cond_8
a=0;// 
a=0;//     .line 633
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 634
a=0;//     .local v15, "numReadyAnims":I
a=0;//     #v15=(Integer);
a=0;//     if-lez v15, :cond_3
a=0;// 
a=0;//     .line 635
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     if-lt v12, v15, :cond_a
a=0;// 
a=0;//     .line 641
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 646
a=0;//     :cond_3
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 647
a=0;//     .local v13, "numAnims":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 648
a=0;//     :goto_3
a=0;//     if-lt v12, v13, :cond_b
a=0;// 
a=0;//     .line 667
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-lez v19, :cond_4
a=0;// 
a=0;//     .line 668
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v19=(Conflicted);
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v12, v0, :cond_e
a=0;// 
a=0;//     .line 671
a=0;//     invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 676
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_5
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     if-nez v19, :cond_0
a=0;// 
a=0;//     .line 677
a=0;//     :cond_5
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     const-wide/16 v20, 0x0
a=0;// 
a=0;//     #v20=(LongLo);v21=(LongHi);
a=0;//     invoke-static {}, Lcom/nineoldandroids/animation/ValueAnimator;->access$12()J
a=0;// 
a=0;//     move-result-wide v22
a=0;// 
a=0;//     .line 678
a=0;//     #v22=(LongLo);v23=(LongHi);
a=0;//     invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
a=0;// 
a=0;//     move-result-wide v24
a=0;// 
a=0;//     #v24=(LongLo);v25=(LongHi);
a=0;//     sub-long v24, v24, v8
a=0;// 
a=0;//     sub-long v22, v22, v24
a=0;// 
a=0;//     .line 677
a=0;//     invoke-static/range {v20 .. v23}, Ljava/lang/Math;->max(JJ)J
a=0;// 
a=0;//     move-result-wide v20
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(One);
a=0;//     move-wide/from16 v2, v20
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcom/nineoldandroids/animation/ValueAnimator$AnimationHandler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 603
a=0;//     .end local v8    # "currentTime":J
a=0;//     .end local v11    # "endingAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     .end local v12    # "i":I
a=0;//     .end local v13    # "numAnims":I
a=0;//     .end local v14    # "numDelayedAnims":I
a=0;//     .end local v15    # "numReadyAnims":I
a=0;//     .end local v18    # "readyAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     .restart local v16    # "pendingAnimations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Uninit);v3=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Conflicted);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Reference,Ljava/util/ArrayList;);v18=(Uninit);v19=(Integer);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Uninit);v24=(Uninit);v25=(Uninit);
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v17, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 604
a=0;//     .local v17, "pendingCopy":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 605
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 606
a=0;//     .local v7, "count":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .restart local v12    # "i":I
a=0;//     :goto_5
a=0;//     #v12=(Integer);
a=0;//     if-ge v12, v7, :cond_2
a=0;// 
a=0;//     .line 607
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 609
a=0;//     .local v4, "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     invoke-static {v4}, Lcom/nineoldandroids/animation/ValueAnimator;->access$5(Lcom/nineoldandroids/animation/ValueAnimator;)J
a=0;// 
a=0;//     move-result-wide v19
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     const-wide/16 v21, 0x0
a=0;// 
a=0;//     #v21=(LongLo);v22=(LongHi);
a=0;//     cmp-long v19, v19, v21
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     if-nez v19, :cond_7
a=0;// 
a=0;//     .line 610
a=0;//     invoke-static {v4}, Lcom/nineoldandroids/animation/ValueAnimator;->access$6(Lcom/nineoldandroids/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 606
a=0;//     :goto_6
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 612
a=0;//     :cond_7
a=0;//     invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 628
a=0;//     .end local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .end local v7    # "count":I
a=0;//     .end local v16    # "pendingAnimations":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     .end local v17    # "pendingCopy":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     .restart local v8    # "currentTime":J
a=0;//     .restart local v11    # "endingAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     .restart local v14    # "numDelayedAnims":I
a=0;//     .restart local v18    # "readyAnims":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/animation/ValueAnimator;>;"
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(LongLo);v9=(LongHi);v11=(Reference,Ljava/util/ArrayList;);v14=(Integer);v16=(Conflicted);v17=(Conflicted);v18=(Reference,Ljava/util/ArrayList;);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 629
a=0;//     .restart local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     invoke-static {v4, v8, v9}, Lcom/nineoldandroids/animation/ValueAnimator;->access$9(Lcom/nineoldandroids/animation/ValueAnimator;J)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_9
a=0;// 
a=0;//     .line 630
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 627
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 636
a=0;//     .end local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .restart local v15    # "numReadyAnims":I
a=0;//     :cond_a
a=0;//     #v4=(Conflicted);v15=(Integer);v19=(Conflicted);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 637
a=0;//     .restart local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     invoke-static {v4}, Lcom/nineoldandroids/animation/ValueAnimator;->access$6(Lcom/nineoldandroids/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 638
a=0;//     const/16 v19, 0x1
a=0;// 
a=0;//     #v19=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v4, v0}, Lcom/nineoldandroids/animation/ValueAnimator;->access$10(Lcom/nineoldandroids/animation/ValueAnimator;Z)V
a=0;// 
a=0;//     .line 639
a=0;//     invoke-virtual {v10, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 635
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 649
a=0;//     .end local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     .restart local v13    # "numAnims":I
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v4=(Conflicted);v13=(Integer);v19=(Conflicted);
a=0;//     invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     .line 650
a=0;//     .restart local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     invoke-virtual {v4, v8, v9}, Lcom/nineoldandroids/animation/ValueAnimator;->animationFrame(J)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_c
a=0;// 
a=0;//     .line 651
a=0;//     invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 653
a=0;//     :cond_c
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v13, :cond_d
a=0;// 
a=0;//     .line 654
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     .line 655
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 663
a=0;//     :cond_d
a=0;//     add-int/lit8 v13, v13, -0x1
a=0;// 
a=0;//     .line 664
a=0;//     invoke-virtual {v11, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 669
a=0;//     .end local v4    # "anim":Lcom/nineoldandroids/animation/ValueAnimator;
a=0;//     :cond_e
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v19, Lcom/nineoldandroids/animation/ValueAnimator;
a=0;// 
a=0;//     invoke-static/range {v19 .. v19}, Lcom/nineoldandroids/animation/ValueAnimator;->access$11(Lcom/nineoldandroids/animation/ValueAnimator;)V
a=0;// 
a=0;//     .line 668
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 588
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
