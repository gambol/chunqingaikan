package com.actionbarsherlock.internal.widget; class IcsListPopupWindow$PopupTouchInterceptor { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsListPopupWindow.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PopupTouchInterceptor"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 7
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 616
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v1, v3
a=0;// 
a=0;//     .line 617
a=0;//     .local v1, "x":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 619
a=0;//     .local v2, "y":I
a=0;//     #v2=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 621
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/PopupWindow;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/PopupWindow;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 622
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$3(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$4(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-wide/16 v5, 0xfa
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 626
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     return v3
a=0;// 
a=0;//     .line 623
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     .line 624
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v3=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v3}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$3(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupTouchInterceptor;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$4(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
