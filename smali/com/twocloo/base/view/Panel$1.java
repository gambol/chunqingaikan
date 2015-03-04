package com.twocloo.base.view; class Panel$1 { void a() { int a;
a=0;// .class Lcom/twocloo/base/view/Panel$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Panel.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
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
a=0;// .field initX:I
a=0;// 
a=0;// .field initY:I
a=0;// 
a=0;// .field setInitialPosition:Z
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/base/view/Panel;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     .line 225
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/view/Panel$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 232
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 234
a=0;//     iput v5, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     .line 235
a=0;//     iput v5, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$0(Lcom/twocloo/base/view/Panel;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$1(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, v2, :cond_3
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     :goto_0
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     iput-boolean v2, p0, Lcom/twocloo/base/view/Panel$1;->setInitialPosition:Z
a=0;// 
a=0;//     .line 260
a=0;//     :goto_2
a=0;//     #v1=(Float);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/view/Panel;->access$6(Lcom/twocloo/base/view/Panel;)Landroid/view/GestureDetector;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 261
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v2, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     iget-object v2, v2, Lcom/twocloo/base/view/Panel;->startAnimation:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/base/view/Panel;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 266
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Byte);v2=(One);v4=(PosByte);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 239
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 241
a=0;//     :cond_3
a=0;//     #v1=(Byte);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$2(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     if-ne v3, v4, :cond_4
a=0;// 
a=0;//     :goto_3
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 246
a=0;//     :cond_5
a=0;//     #v1=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-boolean v1, p0, Lcom/twocloo/base/view/Panel$1;->setInitialPosition:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 248
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$3(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/2addr v1, v3
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     .line 249
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v3}, Lcom/twocloo/base/view/Panel;->access$4(Lcom/twocloo/base/view/Panel;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/2addr v1, v3
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v1, p0, Lcom/twocloo/base/view/Panel$1;->this$0:Lcom/twocloo/base/view/Panel;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/base/view/Panel;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/view/Panel;->access$5(Lcom/twocloo/base/view/Panel;)Lcom/twocloo/base/view/Panel$PanelOnGestureListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Lcom/twocloo/base/view/Panel$PanelOnGestureListener;->setScroll(II)V
a=0;// 
a=0;//     .line 252
a=0;//     iput-boolean v5, p0, Lcom/twocloo/base/view/Panel$1;->setInitialPosition:Z
a=0;// 
a=0;//     .line 254
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     .line 255
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     .line 258
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloo/base/view/Panel$1;->initX:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v3, p0, Lcom/twocloo/base/view/Panel$1;->initY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p2, v1, v3}, Landroid/view/MotionEvent;->offsetLocation(FF)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
