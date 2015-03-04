package com.actionbarsherlock.internal.widget; class IcsListPopupWindow$PopupScrollListener { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsListPopupWindow.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PopupScrollListener"
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
a=0;//     .line 630
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 630
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "firstVisibleItem"    # I
a=0;//     .param p3, "visibleItemCount"    # I
a=0;//     .param p4, "totalItemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "scrollState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 637
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 638
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$5(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$2(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 639
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$3(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$4(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 640
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupScrollListener;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->access$4(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$ResizePopupRunnable;->run()V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
