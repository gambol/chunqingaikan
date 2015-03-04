package com.twocloo.base.view; class Panel$2 { void a() { int a;
a=0;// .class Lcom/twocloo/base/view/Panel$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Panel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/base/view/Panel;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/view/Panel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     .line 270
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/view/Panel$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "fromXDelta":I
a=0;//     #v2=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "toXDelta":I
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "fromYDelta":I
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     .local v6, "toYDelta":I
a=0;//     #v6=(Null);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v10, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v8, v9, :cond_4
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v8=(Boolean);v9=(Conflicted);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/view/Panel;->access$8(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     cmpl-float v9, v9, v11
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-lez v9, :cond_5
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v9=(Boolean);
a=0;//     xor-int/2addr v8, v9
a=0;// 
a=0;//     invoke-static {v10, v8}, Lcom/twocloo/base/view/Panel;->access$9(Lcom/twocloo/base/view/Panel;Z)V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$1(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v8, v9, :cond_c
a=0;// 
a=0;//     .line 281
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$4(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 282
a=0;//     .local v4, "height":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     neg-int v3, v4
a=0;// 
a=0;//     .line 287
a=0;//     :goto_2
a=0;//     #v3=(Integer);v6=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->TRACKING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_a
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$11(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     int-to-float v9, v3
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float/2addr v8, v9
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/view/Panel;->access$11(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     int-to-float v10, v6
a=0;// 
a=0;//     #v10=(Float);
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     cmpg-float v8, v8, v9
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gez v8, :cond_1
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-static {v9, v8}, Lcom/twocloo/base/view/Panel;->access$9(Lcom/twocloo/base/view/Panel;Z)V
a=0;// 
a=0;//     .line 290
a=0;//     move v6, v3
a=0;// 
a=0;//     .line 292
a=0;//     :cond_1
a=0;//     #v8=(Byte);v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$11(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     .line 298
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v8=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_b
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$12(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 299
a=0;//     const/high16 v8, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v9, v6, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget-object v10, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v10}, Lcom/twocloo/base/view/Panel;->access$8(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     div-float/2addr v9, v10
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     mul-float/2addr v8, v9
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v1, v8
a=0;// 
a=0;//     .line 300
a=0;//     .local v1, "calculatedDuration":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v8, 0x14
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 330
a=0;//     .end local v4    # "height":I
a=0;//     :goto_5
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Integer);v9=(Integer);v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v9, v10}, Lcom/twocloo/base/view/Panel;->access$15(Lcom/twocloo/base/view/Panel;F)V
a=0;// 
a=0;//     invoke-static {v8, v10}, Lcom/twocloo/base/view/Panel;->access$16(Lcom/twocloo/base/view/Panel;F)V
a=0;// 
a=0;//     .line 331
a=0;//     if-nez v1, :cond_15
a=0;// 
a=0;//     .line 332
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->READY:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/twocloo/base/view/Panel;->access$17(Lcom/twocloo/base/view/Panel;Lcom/twocloo/base/view/Panel$State;)V
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$0(Lcom/twocloo/base/view/Panel;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$18(Lcom/twocloo/base/view/Panel;)V
a=0;// 
a=0;//     .line 349
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v10=(Float);
a=0;//     return-void
a=0;// 
a=0;//     .line 277
a=0;//     .end local v1    # "calculatedDuration":I
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Null);v4=(Uninit);v5=(Null);v6=(Null);v7=(Uninit);v8=(Integer);v10=(Reference,Lcom/twocloo/base/view/Panel;);v11=(Uninit);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Boolean);v9=(Byte);v11=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .restart local v4    # "height":I
a=0;//     :cond_6
a=0;//     #v4=(Integer);v8=(Integer);v9=(One);v10=(Conflicted);v11=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 283
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 285
a=0;//     :cond_7
a=0;//     #v3=(Null);v8=(Boolean);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     neg-int v6, v4
a=0;// 
a=0;//     :goto_7
a=0;//     #v6=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v6=(Null);
a=0;//     move v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 289
a=0;//     :cond_9
a=0;//     #v3=(Integer);v8=(Boolean);v9=(Reference,Lcom/twocloo/base/view/Panel;);v10=(Float);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 293
a=0;//     :cond_a
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel$State;);v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     if-ne v8, v9, :cond_2
a=0;// 
a=0;//     .line 294
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$11(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 302
a=0;//     :cond_b
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$13(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v9, v6, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     mul-int/2addr v8, v9
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/view/Panel;->access$4(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     div-int v1, v8, v9
a=0;// 
a=0;//     .line 304
a=0;//     .restart local v1    # "calculatedDuration":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 305
a=0;//     .end local v1    # "calculatedDuration":I
a=0;//     .end local v4    # "height":I
a=0;//     :cond_c
a=0;//     #v1=(Uninit);v3=(Null);v4=(Uninit);v6=(Null);v9=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$3(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 306
a=0;//     .local v7, "width":I
a=0;//     #v7=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_10
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v8, v9, :cond_f
a=0;// 
a=0;//     neg-int v2, v7
a=0;// 
a=0;//     .line 311
a=0;//     :goto_8
a=0;//     #v2=(Integer);v5=(Integer);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->TRACKING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_13
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$14(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     int-to-float v9, v2
a=0;// 
a=0;//     #v9=(Float);
a=0;//     sub-float/2addr v8, v9
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/view/Panel;->access$14(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     int-to-float v10, v5
a=0;// 
a=0;//     #v10=(Float);
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     cmpg-float v8, v8, v9
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-gez v8, :cond_d
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$10(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_12
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_9
a=0;//     invoke-static {v9, v8}, Lcom/twocloo/base/view/Panel;->access$9(Lcom/twocloo/base/view/Panel;Z)V
a=0;// 
a=0;//     .line 314
a=0;//     move v5, v2
a=0;// 
a=0;//     .line 316
a=0;//     :cond_d
a=0;//     #v8=(Byte);v9=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$14(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v2, v8
a=0;// 
a=0;//     .line 322
a=0;//     :cond_e
a=0;//     :goto_a
a=0;//     #v8=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_14
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$12(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_14
a=0;// 
a=0;//     .line 323
a=0;//     const/high16 v8, 0x447a0000    # 1000.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v9, v5, v2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-float v9, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget-object v10, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v10}, Lcom/twocloo/base/view/Panel;->access$8(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     div-float/2addr v9, v10
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     mul-float/2addr v8, v9
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v1, v8
a=0;// 
a=0;//     .line 324
a=0;//     .restart local v1    # "calculatedDuration":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v8, 0x14
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 325
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .end local v1    # "calculatedDuration":I
a=0;//     :cond_f
a=0;//     #v1=(Uninit);v2=(Null);v5=(Null);v8=(Integer);v9=(PosByte);v10=(Conflicted);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 307
a=0;//     #v2=(Integer);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 309
a=0;//     :cond_10
a=0;//     #v2=(Null);v8=(Boolean);v9=(One);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v8, v9, :cond_11
a=0;// 
a=0;//     neg-int v5, v7
a=0;// 
a=0;//     :goto_b
a=0;//     #v5=(Integer);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_11
a=0;//     #v5=(Null);
a=0;//     move v5, v7
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 313
a=0;//     :cond_12
a=0;//     #v2=(Integer);v8=(Boolean);v9=(Reference,Lcom/twocloo/base/view/Panel;);v10=(Float);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 317
a=0;//     :cond_13
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel$State;);v10=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     if-ne v8, v9, :cond_e
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$14(Lcom/twocloo/base/view/Panel;)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     float-to-int v2, v8
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 326
a=0;//     :cond_14
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$13(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v9, v5, v2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     mul-int/2addr v8, v9
a=0;// 
a=0;//     iget-object v9, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v9}, Lcom/twocloo/base/view/Panel;->access$3(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     div-int v1, v8, v9
a=0;// 
a=0;//     .restart local v1    # "calculatedDuration":I
a=0;//     #v1=(Integer);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 340
a=0;//     .end local v7    # "width":I
a=0;//     :cond_15
a=0;//     #v3=(Integer);v4=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Reference,Lcom/twocloo/base/view/Panel;);v9=(Reference,Lcom/twocloo/base/view/Panel;);v10=(Null);
a=0;//     new-instance v0, Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/TranslateAnimation;);
a=0;//     int-to-float v8, v2
a=0;// 
a=0;//     #v8=(Float);
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     #v9=(Float);
a=0;//     int-to-float v10, v3
a=0;// 
a=0;//     #v10=(Float);
a=0;//     int-to-float v11, v6
a=0;// 
a=0;//     #v11=(Float);
a=0;//     invoke-direct {v0, v8, v9, v10, v11}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V
a=0;// 
a=0;//     .line 341
a=0;//     .local v0, "animation":Landroid/view/animation/TranslateAnimation;
a=0;//     #v0=(Reference,Landroid/view/animation/TranslateAnimation;);
a=0;//     int-to-long v8, v1
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     invoke-virtual {v0, v8, v9}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$19(Lcom/twocloo/base/view/Panel;)Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 343
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$7(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget-object v9, Lcom/twocloo/base/view/Panel$State;->FLYING:Lcom/twocloo/base/view/Panel$State;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/base/view/Panel$State;);
a=0;//     if-ne v8, v9, :cond_17
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$12(Lcom/twocloo/base/view/Panel;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_17
a=0;// 
a=0;//     .line 344
a=0;//     new-instance v8, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v8}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-virtual {v0, v8}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_16
a=0;//     :goto_c
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lcom/twocloo/base/view/Panel;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 345
a=0;//     :cond_17
a=0;//     #v8=(Conflicted);
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$20(Lcom/twocloo/base/view/Panel;)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_16
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v8, p0, Lcom/twocloo/base/view/Panel$2;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/base/view/Panel;->access$20(Lcom/twocloo/base/view/Panel;)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     goto :goto_c
a=0;// .end method
}}
