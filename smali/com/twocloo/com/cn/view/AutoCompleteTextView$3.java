package com.twocloo.com.cn.view; class AutoCompleteTextView$3 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoCompleteTextView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/view/AutoCompleteTextView;->setPopw()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     .line 199
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "arg0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v2, v2, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->context:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcom/twocloo/com/cn/db/DBAdapter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$5(Lcom/twocloo/com/cn/view/AutoCompleteTextView;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;// 
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$6(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/db/DBAdapter;->deleteSearchHistroy()V
a=0;// 
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$0(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$4(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->relativeLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 210
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/view/AutoCompleteTextView;);
a=0;//     iget-object v0, v0, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->linearLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/view/AutoCompleteTextView$3;->this$0:Lcom/twocloo/com/cn/view/AutoCompleteTextView;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/view/AutoCompleteTextView;->access$3(Lcom/twocloo/com/cn/view/AutoCompleteTextView;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
