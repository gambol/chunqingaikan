package com.google.gson; class JsonPrimitive { void a() { int a;
a=0;// .class public final Lcom/google/gson/JsonPrimitive;
a=0;// .super Lcom/google/gson/JsonElement;
a=0;// .source "JsonPrimitive.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final PRIMITIVE_TYPES:[Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private value:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/Class;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     const-class v2, Ljava/lang/Integer;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     const-class v2, Ljava/lang/Long;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     const-class v2, Ljava/lang/Short;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     const-class v2, Ljava/lang/Float;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     const-class v2, Ljava/lang/Double;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     const-class v2, Ljava/lang/Byte;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     const-class v2, Ljava/lang/Boolean;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     const-class v2, Ljava/lang/Character;
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcom/google/gson/JsonPrimitive;->PRIMITIVE_TYPES:[Ljava/lang/Class;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Boolean;)V
a=0;//     .locals 0
a=0;//     .param p1, "bool"    # Ljava/lang/Boolean;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/JsonPrimitive;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Character;)V
a=0;//     .locals 0
a=0;//     .param p1, "c"    # Ljava/lang/Character;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/JsonPrimitive;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/Number;)V
a=0;//     .locals 0
a=0;//     .param p1, "number"    # Ljava/lang/Number;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/JsonPrimitive;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "primitive"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 85
a=0;//     #p0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/JsonPrimitive;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lcom/google/gson/JsonElement;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     invoke-virtual {p0, p1}, Lcom/google/gson/JsonPrimitive;->setValue(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 66
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static isIntegral(Lcom/google/gson/JsonPrimitive;)Z
a=0;//     .locals 3
a=0;//     .param p0, "primitive"    # Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 334
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v2, v2, Ljava/lang/Number;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     .line 336
a=0;//     .local v0, "number":Ljava/lang/Number;
a=0;//     instance-of v2, v0, Ljava/math/BigInteger;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     instance-of v2, v0, Ljava/lang/Long;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     instance-of v2, v0, Ljava/lang/Integer;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     instance-of v2, v0, Ljava/lang/Short;
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     instance-of v2, v0, Ljava/lang/Byte;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 339
a=0;//     .end local v0    # "number":Ljava/lang/Number;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private static isPrimitiveOrString(Ljava/lang/Object;)Z
a=0;//     .locals 7
a=0;//     .param p0, "target"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 274
a=0;//     #v5=(One);
a=0;//     instance-of v6, p0, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
a=0;//     return v5
a=0;// 
a=0;//     .line 278
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "classOfPrimitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v0, Lcom/google/gson/JsonPrimitive;->PRIMITIVE_TYPES:[Ljava/lang/Class;
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Class;
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_2
a=0;// 
a=0;//     aget-object v4, v0, v2
a=0;// 
a=0;//     .line 280
a=0;//     .local v4, "standardPrimitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 284
a=0;//     .end local v4    # "standardPrimitive":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method bridge synthetic deepCopy()Lcom/google/gson/JsonElement;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->deepCopy()Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/google/gson/JsonPrimitive;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method deepCopy()Lcom/google/gson/JsonPrimitive;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 11
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 306
a=0;//     #v6=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 309
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);v6=(Null);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 310
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(One);v7=(Reference,Ljava/lang/Class;);v8=(Reference,Ljava/lang/Class;);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     .line 312
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lcom/google/gson/JsonPrimitive;
a=0;// 
a=0;//     .line 313
a=0;//     .local v4, "other":Lcom/google/gson/JsonPrimitive;
a=0;//     iget-object v7, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v7, v4, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 316
a=0;//     :cond_4
a=0;//     #v5=(One);
a=0;//     invoke-static {p0}, Lcom/google/gson/JsonPrimitive;->isIntegral(Lcom/google/gson/JsonPrimitive;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     invoke-static {v4}, Lcom/google/gson/JsonPrimitive;->isIntegral(Lcom/google/gson/JsonPrimitive;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     cmp-long v7, v7, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     :cond_5
a=0;//     #v5=(One);v7=(Boolean);v8=(Reference,Ljava/lang/Class;);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v7, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v7, v7, Ljava/lang/Number;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     iget-object v7, v4, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v7, v7, Ljava/lang/Number;
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 323
a=0;//     .local v0, "a":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-virtual {v4}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 324
a=0;//     .local v2, "b":D
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     cmpl-double v7, v0, v2
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v7=(Byte);
a=0;//     move v6, v5
a=0;// 
a=0;//     :cond_7
a=0;//     #v6=(Boolean);
a=0;//     move v5, v6
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 326
a=0;//     .end local v0    # "a":D
a=0;//     .end local v2    # "b":D
a=0;//     :cond_8
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(One);v6=(Null);v7=(Boolean);
a=0;//     iget-object v5, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v6, v4, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsBigDecimal()Ljava/math/BigDecimal;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/math/BigDecimal;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Ljava/math/BigDecimal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/math/BigDecimal;);
a=0;//     iget-object v1, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/math/BigDecimal;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsBigInteger()Ljava/math/BigInteger;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/math/BigInteger;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/math/BigInteger;
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Ljava/math/BigInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/math/BigInteger;);
a=0;//     iget-object v1, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/math/BigInteger;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsBoolean()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsBooleanWrapper()Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 136
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getAsBooleanWrapper()Ljava/lang/Boolean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAsByte()B
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsCharacter()C
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getAsDouble()D
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsFloat()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsInt()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsLong()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsNumber()Ljava/lang/Number;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Lcom/google/gson/internal/LazilyParsedNumber;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/google/gson/internal/LazilyParsedNumber;);
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/google/gson/internal/LazilyParsedNumber;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/google/gson/internal/LazilyParsedNumber;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Number;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsShort()S
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Number;->shortValue()S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAsString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isNumber()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->isBoolean()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 179
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsBooleanWrapper()Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x20
a=0;// 
a=0;//     .line 289
a=0;//     #v4=(PosByte);
a=0;//     iget-object v2, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     const/16 v2, 0x1f
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/Object;);v3=(Uninit);
a=0;//     invoke-static {p0}, Lcom/google/gson/JsonPrimitive;->isIntegral(Lcom/google/gson/JsonPrimitive;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Number;->longValue()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 295
a=0;//     .local v0, "value":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     ushr-long v2, v0, v4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     xor-long/2addr v2, v0
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 297
a=0;//     .end local v0    # "value":J
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v2, v2, Ljava/lang/Number;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {p0}, Lcom/google/gson/JsonPrimitive;->getAsNumber()Ljava/lang/Number;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Number;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 299
a=0;//     .restart local v0    # "value":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     ushr-long v2, v0, v4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     xor-long/2addr v2, v0
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 301
a=0;//     .end local v0    # "value":J
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isBoolean()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/Boolean;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isNumber()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/Number;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isString()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     iget-object v0, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v0, v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method setValue(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .param p1, "primitive"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     instance-of v1, p1, Ljava/lang/Character;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     check-cast p1, Ljava/lang/Character;
a=0;// 
a=0;//     .end local p1    # "primitive":Ljava/lang/Object;
a=0;//     invoke-virtual {p1}, Ljava/lang/Character;->charValue()C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "c":C
a=0;//     #v0=(Char);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     .line 104
a=0;//     .end local v0    # "c":C
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 100
a=0;//     .restart local p1    # "primitive":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     instance-of v1, p1, Ljava/lang/Number;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-static {p1}, Lcom/google/gson/JsonPrimitive;->isPrimitiveOrString(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-static {v1}, Lcom/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V
a=0;// 
a=0;//     .line 102
a=0;//     iput-object p1, p0, Lcom/google/gson/JsonPrimitive;->value:Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_2
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
