package com.actionbarsherlock.internal.widget; class ActionBarView$2 { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/ActionBarView$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/internal/widget/ActionBarView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$2;->this$0:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 155
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/ActionBarView$2;->this$0:Lcom/actionbarsherlock/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/widget/ActionBarView;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->access$1(Lcom/actionbarsherlock/internal/widget/ActionBarView;)Lcom/actionbarsherlock/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v1, Lcom/actionbarsherlock/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "item":Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/MenuItemImpl;->collapseActionView()Z
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
