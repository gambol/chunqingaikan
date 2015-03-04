package com.actionbarsherlock.internal.view.menu; class MenuWrapper { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mNativeMap:Ljava/util/WeakHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Landroid/view/MenuItem;",
a=0;//             "Lcom/actionbarsherlock/view/MenuItem;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/view/Menu;)V
a=0;//     .locals 1
a=0;//     .param p1, "nativeMenu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 15
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     .line 19
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "nativeItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     .line 28
a=0;//     .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 29
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 4
a=0;//     .param p1, "nativeSubMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     invoke-direct {v2, p1}, Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;-><init>(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     .line 54
a=0;//     .local v2, "subMenu":Lcom/actionbarsherlock/view/SubMenu;
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/SubMenuWrapper;);
a=0;//     invoke-interface {p1}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 55
a=0;//     .local v1, "nativeItem":Landroid/view/MenuItem;
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v2}, Lcom/actionbarsherlock/view/SubMenu;->getItem()Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "item":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     iget-object v3, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v3, v1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIII)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/view/MenuItem;)I
a=0;//     .locals 23
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "caller"    # Landroid/content/ComponentName;
a=0;//     .param p5, "specifics"    # [Landroid/content/Intent;
a=0;//     .param p6, "intent"    # Landroid/content/Intent;
a=0;//     .param p7, "flags"    # I
a=0;//     .param p8, "outSpecificItems"    # [Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     if-eqz p8, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     move-object/from16 v0, p8
a=0;// 
a=0;//     #v0=(Reference,[Lcom/actionbarsherlock/view/MenuItem;);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v10, v2, [Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 85
a=0;//     .local v10, "nativeOutItems":[Landroid/view/MenuItem;
a=0;//     #v10=(Reference,[Landroid/view/MenuItem;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Menu;);
a=0;//     move/from16 v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v5, p3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v6, p4
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/ComponentName;);
a=0;//     move-object/from16 v7, p5
a=0;// 
a=0;//     #v7=(Reference,[Landroid/content/Intent;);
a=0;//     move-object/from16 v8, p6
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     move/from16 v9, p7
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-interface/range {v2 .. v10}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 86
a=0;//     .local v22, "result":I
a=0;//     #v22=(Integer);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .local v20, "i":I
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, p8
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     .local v21, "length":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v20=(Integer);v21=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     .end local v10    # "nativeOutItems":[Landroid/view/MenuItem;
a=0;//     .end local v20    # "i":I
a=0;//     .end local v21    # "length":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);
a=0;//     return v22
a=0;// 
a=0;//     .line 87
a=0;//     .restart local v10    # "nativeOutItems":[Landroid/view/MenuItem;
a=0;//     .restart local v20    # "i":I
a=0;//     .restart local v21    # "length":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ujava/lang/Object;);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Reference,Landroid/content/ComponentName;);v7=(Reference,[Landroid/content/Intent;);v8=(Reference,Landroid/content/Intent;);v9=(Integer);v10=(Reference,[Landroid/view/MenuItem;);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Integer);v21=(Integer);
a=0;//     new-instance v2, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     aget-object v3, v10, v20
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, v3}, Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuItemWrapper;);
a=0;//     aput-object v2, p8, v20
a=0;// 
a=0;//     .line 86
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     .end local v10    # "nativeOutItems":[Landroid/view/MenuItem;
a=0;//     .end local v20    # "i":I
a=0;//     .end local v21    # "length":I
a=0;//     .end local v22    # "result":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     iget-object v11, v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/Menu;);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move/from16 v12, p1
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move/from16 v13, p2
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move/from16 v14, p3
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p4
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/ComponentName;);
a=0;//     move-object/from16 v16, p5
a=0;// 
a=0;//     #v16=(Reference,[Landroid/content/Intent;);
a=0;//     move-object/from16 v17, p6
a=0;// 
a=0;//     #v17=(Reference,Landroid/content/Intent;);
a=0;//     move/from16 v18, p7
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     invoke-interface/range {v11 .. v19}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .restart local v22    # "result":I
a=0;//     #v22=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(I)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIII)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;//     .param p2, "itemId"    # I
a=0;//     .param p3, "order"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/SubMenu;)Lcom/actionbarsherlock/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/Menu;->clear()V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0}, Landroid/view/Menu;->close()V
a=0;// 
a=0;//     .line 164
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public findItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v1, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "nativeItem":Landroid/view/MenuItem;
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "nativeItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/MenuItem;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMap:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "wrapped":Lcom/actionbarsherlock/view/MenuItem;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 147
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->addInternal(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Lcom/actionbarsherlock/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v1, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "nativeItem":Landroid/view/MenuItem;
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->findItem(Landroid/view/MenuItem;)Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public hasVisibleItems()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShortcutKey(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/Menu;->isShortcutKey(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performIdentifierAction(II)Z
a=0;//     .locals 1
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/Menu;->performIdentifierAction(II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performShortcut(ILandroid/view/KeyEvent;I)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeGroup(I)V
a=0;//     .locals 1
a=0;//     .param p1, "groupId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->removeGroup(I)V
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeItem(I)V
a=0;//     .locals 1
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->removeItem(I)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupCheckable(IZZ)V
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "checkable"    # Z
a=0;//     .param p3, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V
a=0;// 
a=0;//     .line 114
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupEnabled(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V
a=0;// 
a=0;//     .line 124
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupVisible(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setQwertyMode(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isQwerty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/Menu;->setQwertyMode(Z)V
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0}, Landroid/view/Menu;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public unwrap()Landroid/view/Menu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;->mNativeMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     return-object v0
a=0;// .end method
}}
