package com.actionbarsherlock.internal.widget; class CollapsibleActionViewWrapper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "CollapsibleActionViewWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/CollapsibleActionView;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final child:Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 15
a=0;//     check-cast v0, Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->child:Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     .line 16
a=0;//     invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionViewCollapsed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->child:Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/CollapsibleActionView;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/CollapsibleActionView;->onActionViewCollapsed()V
a=0;// 
a=0;//     .line 25
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActionViewExpanded()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->child:Lcom/actionbarsherlock/view/CollapsibleActionView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/CollapsibleActionView;);
a=0;//     invoke-interface {v0}, Lcom/actionbarsherlock/view/CollapsibleActionView;->onActionViewExpanded()V
a=0;// 
a=0;//     .line 21
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unwrap()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/widget/CollapsibleActionViewWrapper;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
}}
