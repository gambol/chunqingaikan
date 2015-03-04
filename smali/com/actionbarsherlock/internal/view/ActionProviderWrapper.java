package com.actionbarsherlock.internal.view; class ActionProviderWrapper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;
a=0;// .super Landroid/view/ActionProvider;
a=0;// .source "ActionProviderWrapper.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/view/ActionProvider;)V
a=0;//     .locals 1
a=0;//     .param p1, "provider"    # Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/view/ActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;);
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     .line 14
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/view/ActionProvider;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/view/ActionProvider;->onCreateActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPerformDefaultAction()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/view/ActionProvider;->onPerformDefaultAction()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;//     .locals 2
a=0;//     .param p1, "subMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     new-instance v1, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     invoke-direct {v1, p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;-><init>(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/view/ActionProvider;->onPrepareSubMenu(Lcom/actionbarsherlock/view/SubMenu;)V
a=0;// 
a=0;//     .line 39
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unwrap()Lcom/actionbarsherlock/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/ActionProviderWrapper;->mProvider:Lcom/actionbarsherlock/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionProvider;);
a=0;//     return-object v0
a=0;// .end method
}}
