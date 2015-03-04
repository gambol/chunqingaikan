package com.twocloo.com.cn.view; class ObservableScrollView { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/view/ObservableScrollView;
a=0;// .super Landroid/widget/ScrollView;
a=0;// .source "ObservableScrollView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/ObservableScrollView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public computeVerticalScrollRange()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-super {p0}, Landroid/widget/ScrollView;->computeVerticalScrollRange()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onScrollChanged(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "l"    # I
a=0;//     .param p2, "t"    # I
a=0;//     .param p3, "oldl"    # I
a=0;//     .param p4, "oldt"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;->onScrollChanged(I)V
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 47
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;);
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;->onDownMotionEvent()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;);
a=0;//     invoke-interface {v0}, Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;->onUpOrCancelMotionEvent()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 45
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setCallbacks(Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/ObservableScrollView;->mCallbacks:Lcom/twocloo/com/cn/view/ObservableScrollView$Callbacks;
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
}}
